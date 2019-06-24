package hunitalla.conversion

import hunitalla.Quantity
import hunitalla.Unit
import hunitalla.conversion.BaseConverter.Scalar
import hunitalla.conversion.BaseConverter.Shifter

operator fun <Q : Quantity<Q>> Number.times(unit: Unit<Q>) = Scalar(this, unit)
operator fun <Q : Quantity<Q>> Double.times(unit: Unit<Q>) = Scalar(this, unit)

operator fun <Q : Quantity<Q>> Unit<Q>.times(factor: Number) = Scalar(factor, this)
operator fun <Q : Quantity<Q>> Unit<Q>.times(factor: Double) = Scalar(factor, this)

operator fun <Q : Quantity<Q>> Unit<Q>.div(factor: Number) = Scalar(1 / factor.toDouble(), this)
operator fun <Q : Quantity<Q>> Unit<Q>.div(factor: Double) = Scalar(1 / factor, this)

operator fun <Q : Quantity<Q>> Number.times(factor: Scalar<Q>) = factor * this
operator fun <Q : Quantity<Q>> Double.times(factor: Scalar<Q>) = factor * this

operator fun <Q : Quantity<Q>> Number.div(factor: Scalar<Q>) = factor * (1 / toDouble())
operator fun <Q : Quantity<Q>> Double.div(factor: Scalar<Q>) = factor * (1 / this)

operator fun <Q : Quantity<Q>> Number.plus(unit: Unit<Q>) = Shifter(this, unit)
operator fun <Q : Quantity<Q>> Double.plus(unit: Unit<Q>) = Shifter(this, unit)

operator fun <Q : Quantity<Q>> Number.minus(unit: Unit<Q>) = Shifter(this, unit)
operator fun <Q : Quantity<Q>> Double.minus(unit: Unit<Q>) = Shifter(this, unit)

operator fun <Q : Quantity<Q>> Unit<Q>.plus(shift: Number) = Shifter(shift, this)
operator fun <Q : Quantity<Q>> Unit<Q>.plus(shift: Double) = Shifter(shift, this)

operator fun <Q : Quantity<Q>> Unit<Q>.minus(shift: Number) = Shifter(shift, this)
operator fun <Q : Quantity<Q>> Unit<Q>.minus(shift: Double) = Shifter(shift, this)

operator fun <Q : Quantity<Q>> Number.plus(shifter: Shifter<Q>) = shifter + this
operator fun <Q : Quantity<Q>> Double.plus(shifter: Shifter<Q>) = shifter + this

operator fun <Q : Quantity<Q>> Number.minus(shifter: Shifter<Q>) = -shifter + this
operator fun <Q : Quantity<Q>> Double.minus(shifter: Shifter<Q>) = shifter + this
