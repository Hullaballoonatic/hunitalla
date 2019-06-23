@file:Suppress("MemberVisibilityCanBePrivate")

package hunitalla

import hunitalla.helpers.attributes.Named
import hunitalla.helpers.attributes.Symbolic
import hunitalla.helpers.attributes.Valuable
import hunitalla.helpers.functions.string.insertSpaces
import kotlin.reflect.KClass
import kotlin.reflect.KFunction1

interface Unit<Q : Quantity<Q>> : Named, Symbolic {
    val quantifier: KFunction1<Double, Quantity<Q>>
    val baseValueOf: (Double) -> Double

    operator fun invoke(value: Double) = quantifier(value)
    operator fun invoke(value: Number) = invoke(value.toDouble())

    val quantityRef: Quantity<Q>

    val dimension: Dimension
    val quantityType: KClass<out Quantity<Q>>

    operator fun times(unit: Unit<*>): Unit<*> = dimension.times(unit.dimension).baseUnit
    operator fun div(unit: Unit<*>): Unit<*> = dimension.div(unit.dimension).baseUnit
    infix fun pow(exponent: Int): Unit<*> = dimension.pow(exponent).baseUnit

    val inverse: Unit<*>

    object UnrecognizedCombinationError : Error("Unrecognized combination of units.")

    open class BaseUnit<Q : Quantity<Q>>(
        name: String? = null,
        override val symbol: String,
        override val quantifier: KFunction1<Double, Quantity<Q>>,
        override val baseValueOf: (Double) -> Double = { it }
    ) : Unit<Q> {
        override val name: String = name ?: javaClass.simpleName.insertSpaces()

        constructor(symbol: String, quantifier: KFunction1<Double, Quantity<Q>>) : this(null, symbol, quantifier)
        constructor(name: String, symbol: String, conversion: Scalar<Q>) :
                this(name, symbol, conversion.unit.quantifier, { conversion.value * it })

        constructor(symbol: String, conversion: Scalar<Q>) :
                this(null, symbol, conversion.unit.quantifier, { conversion.value * it })

        constructor(name: String, symbol: String, shift: Shifter<Q>) :
                this(name, symbol, shift.unit.quantifier, { shift.value + it })

        constructor(symbol: String, shift: Shifter<Q>) :
                this(null, symbol, shift.unit.quantifier, { shift.value + it })

        override val quantityRef by lazy { quantifier(0.0) }

        override val dimension by lazy { quantityRef.dimension }
        override val quantityType by lazy { quantityRef::class }

        override val inverse: BaseUnit<*> by lazy { dimension.pow(-1).baseUnit }
    }

    class Shifter<Q : Quantity<Q>> private constructor(override val value: Double, val unit: Unit<Q>) :
        Valuable<Double> {
        companion object {
            operator fun <Q : Quantity<Q>> invoke(shift: Double, unit: Unit<Q>) =
                Shifter(unit.baseValueOf(shift), unit)

            operator fun <Q : Quantity<Q>> invoke(shift: Number, unit: Unit<Q>) =
                Shifter(unit.baseValueOf(shift.toDouble()), unit)
        }

        operator fun plus(shift: Double) = Shifter(this.value + shift, unit)
        operator fun plus(shift: Number) = plus(shift.toDouble())
        operator fun minus(shift: Double) = Shifter(this.value - shift, unit)
        operator fun minus(shift: Number) = minus(shift.toDouble())
        operator fun unaryMinus() = negation

        val negation: Shifter<Q> by lazy { Shifter(-value, unit) }
    }

    class Scalar<Q : Quantity<Q>> private constructor(override val value: Double, val unit: Unit<Q>) :
        Valuable<Double> {
        companion object {
            operator fun <Q : Quantity<Q>> invoke(factor: Double, unit: Unit<Q>) =
                Scalar(unit.baseValueOf(factor), unit)

            operator fun <Q : Quantity<Q>> invoke(factor: Number, unit: Unit<Q>) =
                Scalar(unit.baseValueOf(factor.toDouble()), unit)
        }

        operator fun div(divisor: Number) = div(divisor.toDouble())
        operator fun div(divisor: Double) = Scalar(value / divisor, unit)
        operator fun times(scalar: Number) = times(scalar.toDouble())
        operator fun times(scalar: Double) = Scalar(value * scalar, unit)
    }
}
