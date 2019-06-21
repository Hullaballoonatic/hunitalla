package hunitalla.helpers.extensions.conversion

import hunitalla.Quantity
import hunitalla.Unit
import hunitalla.Unit.ScaledUnit.ConversionFactor

operator fun <Q : Quantity<Q>> Number.times(unit: Unit<Q>) = ConversionFactor(this, unit)
operator fun <Q : Quantity<Q>> Double.times(unit: Unit<Q>) = ConversionFactor(this, unit)
operator fun <Q : Quantity<Q>> Number.times(si: Unit.SI<Q>) = ConversionFactor(this, si)
operator fun <Q : Quantity<Q>> Double.times(si: Unit.SI<Q>) = ConversionFactor(this, si)

operator fun <Q : Quantity<Q>> Unit<Q>.times(factor: Number) = ConversionFactor(factor, this)
operator fun <Q : Quantity<Q>> Unit<Q>.times(factor: Double) = ConversionFactor(factor, this)
operator fun <Q : Quantity<Q>> Unit.SI<Q>.times(factor: Number) = ConversionFactor(factor, this)
operator fun <Q : Quantity<Q>> Unit.SI<Q>.times(factor: Double) = ConversionFactor(factor, this)

operator fun <Q : Quantity<Q>> Unit<Q>.div(factor: Number) = ConversionFactor(1 / factor.toDouble(), this)
operator fun <Q : Quantity<Q>> Unit<Q>.div(factor: Double) = ConversionFactor(1 / factor, this)
operator fun <Q : Quantity<Q>> Unit.SI<Q>.div(factor: Number) = ConversionFactor(1 / factor.toDouble(), this)
operator fun <Q : Quantity<Q>> Unit.SI<Q>.div(factor: Double) = ConversionFactor(1 / factor, this)

operator fun <Q : Quantity<Q>> Number.times(factor: ConversionFactor<Q>) = factor * this
operator fun <Q : Quantity<Q>> Double.times(factor: ConversionFactor<Q>) = factor * this

operator fun <Q : Quantity<Q>> Number.div(factor: ConversionFactor<Q>) = factor * (1 / toDouble())
operator fun <Q : Quantity<Q>> Double.div(factor: ConversionFactor<Q>) = factor * (1 / this)
