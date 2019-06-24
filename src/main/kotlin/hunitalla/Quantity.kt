@file:Suppress("NonAsciiCharacters")

package hunitalla

import hunitalla.Unit.Base
import hunitalla.Unit.Converted
import hunitalla.helpers.attributes.Named
import hunitalla.helpers.attributes.Valuable
import hunitalla.helpers.functions.string.insertSpaces

abstract class Quantity<Q : Quantity<Q>>(
    override val value: Double,
    name: String?,
    val unit: Unit<Q>,
    val dimension: Dimension
) : Named, Valuable<Double> {
    constructor(value: Double, unit: Unit<Q>, dimension: Dimension) : this(value, null, unit, dimension)
    constructor(
        value: Double,
        unit: Unit<Q>,
        L: Int = 0,
        M: Int = 0,
        T: Int = 0,
        I: Int = 0,
        Θ: Int = 0,
        N: Int = 0,
        J: Int = 0
    ) : this(value, unit, Dimension(L, M, T, I, Θ, N, J))

    constructor(
        value: Double, name: String, unit: Unit<Q>,
        L: Int = 0, M: Int = 0, T: Int = 0, I: Int = 0, Θ: Int = 0, N: Int = 0, J: Int = 0
    ) : this(value, name, unit, Dimension(L, M, T, I, Θ, N, J))

    val baseValue by lazy { unit.convertToBase(value) }
    val baseQuantity by lazy {
        when (unit) {
            is Base<Q> -> this
            is Converted<Q> -> unit.converter.toBase(this)
        }
    }

    override val name: String = name ?: javaClass.simpleName.insertSpaces()

    object UnrecognizedCombinationError : Error("Unrecognized combination of units.")

    operator fun plus(other: Quantity<Q>) = of(unit.convertFromBase(baseValue + other.baseValue))
    operator fun minus(other: Quantity<Q>) = of(unit.convertFromBase(baseValue - other.baseValue))
    operator fun unaryMinus(): Quantity<Q> = of(-value)

    operator fun times(scalar: Number) = times(scalar.toDouble())
    operator fun times(scalar: Double) = of(value * scalar)

    operator fun <T : Quantity<T>> times(unit: Unit<*>) =
        (dimension * unit).get<T>(unit.system)?.let { it.invoke(it.convertFromBase(baseValue)) }
            ?: throw UnrecognizedCombinationError

    operator fun <T : Quantity<T>> div(unit: Unit<*>) =
        (dimension / unit).get<T>(unit.system)?.let { it.invoke(it.convertFromBase(baseValue)) }
            ?: throw UnrecognizedCombinationError

    operator fun div(divisor: Number) = div(divisor.toDouble())
    operator fun div(divisor: Double) = of(value / divisor)

    operator fun <T : Quantity<T>> times(other: Quantity<*>) =
        (dimension * other).get<T>(unit.system)?.let { it.invoke(it.convertFromBase(baseValue * other.baseValue)) }
            ?: throw UnrecognizedCombinationError

    operator fun <T : Quantity<T>> div(other: Quantity<*>) =
        (dimension / other).get<T>(unit.system)?.let { it.invoke(it.convertFromBase(baseValue / other.baseValue)) }
            ?: throw UnrecognizedCombinationError

    infix fun <T : Quantity<T>> pow(exponent: Int) =
        (dimension pow exponent).get<T>(unit.system)?.invoke(value) ?: throw UnrecognizedCombinationError

    infix fun <T : Quantity<T>> root(base: Int) =
        (dimension root base).get<T>(unit.system)?.invoke(value) ?: throw UnrecognizedCombinationError

    fun of(value: Double): Quantity<Q> = unit.invoke(value)
    fun of(value: Number): Quantity<Q> = unit.invoke(value)

    override fun toString() = "$value${unit.symbol}"
}
