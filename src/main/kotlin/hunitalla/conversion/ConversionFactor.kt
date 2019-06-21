package hunitalla.conversion

import hunitalla.Quantity
import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.attributes.Valuable

class ConversionFactor<Q: Quantity<Q>>private constructor(override val value: Double, val unit: Unit<Q>) : Valuable<Double> {
    companion object {
        operator fun <Q: Quantity<Q>> invoke(factor: Double, si: SIUnit<Q>) = ConversionFactor(factor, si)
        operator fun <Q: Quantity<Q>> invoke(factor: Number, si: SIUnit<Q>) = ConversionFactor(factor.toDouble(), si)
        operator fun <Q: Quantity<Q>> invoke(factor: Double, unit: Unit<Q>) = ConversionFactor(unit.siValueOf(factor), unit)
        operator fun <Q: Quantity<Q>> invoke(factor: Number, unit: Unit<Q>) = ConversionFactor(unit.siValueOf(factor.toDouble()), unit)
    }
    operator fun div(divisor: Number) = div(divisor.toDouble())
    operator fun div(divisor: Double) = ConversionFactor(value / divisor, unit)
    operator fun times(scalar: Number) = times(scalar.toDouble())
    operator fun times(scalar: Double) = ConversionFactor(value * scalar, unit)
}


