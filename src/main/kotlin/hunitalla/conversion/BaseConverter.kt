package hunitalla.conversion

import hunitalla.Quantity
import hunitalla.Unit
import hunitalla.Unit.Base
import hunitalla.helpers.attributes.Converter
import hunitalla.helpers.attributes.Valuable

sealed class BaseConverter<Q : Quantity<Q>>(val unit: Unit<Q>, val baseUnit: Base<Q> = unit.base) :
    Converter<Quantity<Q>, Quantity<Q>> {
    abstract val toBase: (value: Double) -> Double
    abstract val fromBase: (value: Double) -> Double

    fun toBase(quantity: Quantity<Q>) = forward(quantity)
    fun fromBase(baseQuantity: Quantity<Q>) = reverse(baseQuantity)

    override val forward: (Quantity<Q>) -> Quantity<Q> = { baseUnit(toBase(it.value)) }
    override val reverse: (Quantity<Q>) -> Quantity<Q> = { unit(fromBase(it.baseValue)) }

    class Scalar<Q : Quantity<Q>> private constructor(override val value: Double, unit: Unit<Q>) :
        Valuable<Double>, BaseConverter<Q>(unit) {

        override val toBase: (Double) -> Double = { unit.convertToBase(it / value) }
        override val fromBase: (Double) -> Double = { it * value }

        companion object {
            operator fun <Q : Quantity<Q>> invoke(scalar: Double, unit: Unit<Q>) =
                Scalar(unit.convertToBase(scalar), unit)

            operator fun <Q : Quantity<Q>> invoke(scalar: Number, unit: Unit<Q>) = invoke(scalar.toDouble(), unit)

            operator fun <Q : Quantity<Q>> invoke(ratio: Quantity<Q>) = Scalar(ratio.value, ratio.unit)
        }

        operator fun div(divisor: Number) = div(divisor.toDouble())
        operator fun div(divisor: Double) = Scalar(value / divisor, unit)
        operator fun times(scalar: Number) = times(scalar.toDouble())
        operator fun times(scalar: Double) = Scalar(value * scalar, unit)
    }

    class Shifter<Q : Quantity<Q>> private constructor(override val value: Double, unit: Unit<Q>) :
        Valuable<Double>, BaseConverter<Q>(unit) {

        override val toBase: (Double) -> Double = { unit.convertToBase(it - value) }
        override val fromBase: (Double) -> Double = { it + value }

        companion object {
            operator fun <Q : Quantity<Q>> invoke(shift: Double, unit: Unit<Q>) =
                Shifter(unit.convertToBase(shift), unit)

            operator fun <Q : Quantity<Q>> invoke(shift: Number, unit: Unit<Q>) =
                Shifter(unit.convertToBase(shift.toDouble()), unit)
        }

        operator fun plus(shift: Double) = Shifter(value + shift, unit)
        operator fun plus(shift: Number) = plus(shift.toDouble())
        operator fun minus(shift: Double) = Shifter(value - shift, unit)
        operator fun minus(shift: Number) = minus(shift.toDouble())
        operator fun unaryMinus() = negation

        val negation: Shifter<Q> by lazy { Shifter(-value, unit) }
    }
}
