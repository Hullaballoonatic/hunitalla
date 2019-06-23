package hunitalla.helpers.extensions.conversion

import hunitalla.Quantity
import hunitalla.Unit
import hunitalla.Unit.Scalar

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
