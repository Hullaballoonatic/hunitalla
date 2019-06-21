package hunitalla.conversion

import hunitalla.Quantity
import hunitalla.SIUnit
import hunitalla.Unit

// Conversion Factor extensions
operator fun <Q: Quantity<Q>> Number.times(unit: Unit<Q>) = ConversionFactor(this, unit)
operator fun <Q: Quantity<Q>> Double.times(unit: Unit<Q>) = ConversionFactor(this, unit)
operator fun <Q: Quantity<Q>> Number.times(si: SIUnit<Q>) = ConversionFactor(this, si)
operator fun <Q: Quantity<Q>> Double.times(si: SIUnit<Q>) = ConversionFactor(this, si)

operator fun <Q: Quantity<Q>> Number.div(unit: Unit<Q>): ConversionFactor<Q> = ConversionFactor(this, unit.inverse)
operator fun <Q: Quantity<Q>> Double.div(unit: Unit<Q>): ConversionFactor<Q> = ConversionFactor(this, unit.inverse)
operator fun <Q: Quantity<Q>> Number.div(si: SIUnit<Q>): ConversionFactor<Q> = ConversionFactor(this, si.inverse)
operator fun <Q: Quantity<Q>> Double.div(si: SIUnit<Q>): ConversionFactor<Q> = ConversionFactor(this, si.inverse)

operator fun <Q: Quantity<Q>> Unit<Q>.times(factor: Number) = ConversionFactor(factor, this)
operator fun <Q: Quantity<Q>> Unit<Q>.times(factor: Double) = ConversionFactor(factor, this)
operator fun <Q: Quantity<Q>> SIUnit<Q>.times(factor: Number) = ConversionFactor(factor, this)
operator fun <Q: Quantity<Q>> SIUnit<Q>.times(factor: Double) = ConversionFactor(factor, this)

operator fun <Q: Quantity<Q>> Unit<Q>.div(factor: Number) = ConversionFactor(1 / factor.toDouble(), this)
operator fun <Q: Quantity<Q>> Unit<Q>.div(factor: Double) = ConversionFactor(1 / factor, this)
operator fun <Q: Quantity<Q>> SIUnit<Q>.div(factor: Number) = ConversionFactor(1 / factor.toDouble(), this)
operator fun <Q: Quantity<Q>> SIUnit<Q>.div(factor: Double) = ConversionFactor(1 / factor, this)

operator fun <Q: Quantity<Q>> Number.times(factor: ConversionFactor<Q>) = factor * this
operator fun <Q: Quantity<Q>> Double.times(factor: ConversionFactor<Q>) = factor * this

operator fun <Q: Quantity<Q>> Number.div(factor: ConversionFactor<Q>) = factor * (1 / toDouble())
operator fun <Q: Quantity<Q>> Double.div(factor: ConversionFactor<Q>) = factor * (1 / this)

// Shifter extensions
operator fun <Q: Quantity<Q>> Number.plus(unit: Unit<Q>) = Shifter(this, unit)
operator fun <Q: Quantity<Q>> Double.plus(unit: Unit<Q>) = Shifter(this, unit)
operator fun <Q: Quantity<Q>> Number.plus(si: SIUnit<Q>) = Shifter(this, si)
operator fun <Q: Quantity<Q>> Double.plus(si: SIUnit<Q>) = Shifter(this, si)

operator fun <Q: Quantity<Q>> Number.minus(unit: Unit<Q>) = Shifter(this, unit)
operator fun <Q: Quantity<Q>> Double.minus(unit: Unit<Q>) = Shifter(this, unit)
operator fun <Q: Quantity<Q>> Number.minus(si: SIUnit<Q>) = Shifter(this, si)
operator fun <Q: Quantity<Q>> Double.minus(si: SIUnit<Q>) = Shifter(this, si)

operator fun <Q: Quantity<Q>> Unit<Q>.plus(shift: Number) = Shifter(shift, this)
operator fun <Q: Quantity<Q>> Unit<Q>.plus(shift: Double) = Shifter(shift, this)
operator fun <Q: Quantity<Q>> SIUnit<Q>.plus(shift: Number) = Shifter(shift, this)
operator fun <Q: Quantity<Q>> SIUnit<Q>.plus(shift: Double) = Shifter(shift, this)

operator fun <Q: Quantity<Q>> Unit<Q>.minus(shift: Number) = Shifter(shift, this)
operator fun <Q: Quantity<Q>> Unit<Q>.minus(shift: Double) = Shifter(shift, this)
operator fun <Q: Quantity<Q>> SIUnit<Q>.minus(shift: Number) = Shifter(shift, this)
operator fun <Q: Quantity<Q>> SIUnit<Q>.minus(shift: Double) = Shifter(shift, this)

operator fun <Q: Quantity<Q>> Number.plus(shifter: Shifter<Q>) = shifter + this
operator fun <Q: Quantity<Q>> Double.plus(shifter: Shifter<Q>) = shifter + this

operator fun <Q: Quantity<Q>> Number.minus(shifter: Shifter<Q>) = -shifter + this
operator fun <Q: Quantity<Q>> Double.minus(shifter: Shifter<Q>) = shifter + this
