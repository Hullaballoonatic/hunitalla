@file:Suppress("MemberVisibilityCanBePrivate")

package hunitalla

import hunitalla.UnitSystem.GetBy
import hunitalla.UnitSystem.GetBy.*
import hunitalla.conversion.BaseConverter
import hunitalla.helpers.attributes.Named
import hunitalla.helpers.attributes.Symbolic
import hunitalla.helpers.functions.string.insertSpaces
import hunitalla.units.si.SI
import kotlin.reflect.KClass
import kotlin.reflect.KFunction1

sealed class Unit<Q : Quantity<Q>>(
    name: String? = null,
    override val symbol: String,
    quantifier: KFunction1<Double, Quantity<Q>>,
    val system: UnitSystem
) : Named, Symbolic {
    override val name = name ?: javaClass.simpleName.insertSpaces()

    abstract val base: Base<Q>

    abstract fun convertToBase(value: Double): Double
    abstract fun convertFromBase(baseValue: Double): Double

    operator fun invoke(value: Double): Quantity<Q> = quantityRef.of(value)
    operator fun invoke(value: Number): Quantity<Q> = invoke(value.toDouble())

    val quantityRef: Quantity<Q> by lazy { quantifier(0.0) }

    val dimension: Dimension by lazy { quantityRef.dimension }
    val quantityType: KClass<out Quantity<Q>> by lazy { quantityRef::class }

    open operator fun <T : Quantity<T>> times(unit: Unit<*>): Unit<T> =
        dimension.times(unit.dimension)[system] ?: throw Quantity.UnrecognizedCombinationError

    open operator fun <T : Quantity<T>> div(unit: Unit<*>): Unit<T> =
        dimension.div(unit.dimension)[system] ?: throw Quantity.UnrecognizedCombinationError

    open infix fun <T : Quantity<T>> pow(exponent: Int): Unit<T> =
        dimension.pow(exponent)[system] ?: throw Quantity.UnrecognizedCombinationError

    operator fun get(by: GetBy): String = when (by) {
        NAME -> name
        SYMBOL -> symbol
        TO_STRING -> toString()
    }

    open class Base<Q : Quantity<Q>>(
        name: String? = null,
        symbol: String,
        quantifier: KFunction1<Double, Quantity<Q>>,
        system: UnitSystem = SI
    ) : Unit<Q>(name, symbol, quantifier, system) {
        constructor(symbol: String, quantifier: KFunction1<Double, Quantity<Q>>) : this(null, symbol, quantifier)

        override val base by lazy { this }

        override fun convertToBase(value: Double) = value
        override fun convertFromBase(baseValue: Double) = baseValue
    }

    open class Converted<Q : Quantity<Q>>(
        name: String? = null,
        symbol: String,
        val converter: BaseConverter<Q>,
        system: UnitSystem = SI
    ) : Unit<Q>(name, symbol, converter.unit::invoke, system) {
        constructor(symbol: String, converter: BaseConverter<Q>, system: UnitSystem = SI) :
                this(null, symbol, converter, system)

        constructor(name: String, symbol: String, ratio: Quantity<Q>, system: UnitSystem = SI) :
                this(name, symbol, BaseConverter.Scalar(ratio), system)

        constructor(symbol: String, ratio: Quantity<Q>, system: UnitSystem = SI) :
                this(null, symbol, BaseConverter.Scalar(ratio), system)

        override val base by lazy { converter.baseUnit }

        override fun convertFromBase(baseValue: Double) = converter.fromBase(baseValue)
        override fun convertToBase(value: Double) = converter.toBase(value)
    }

    override fun toString() = "$name ($symbol) belonging to system: $system"
}
