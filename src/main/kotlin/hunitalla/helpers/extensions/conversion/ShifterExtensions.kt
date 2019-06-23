package hunitalla.helpers.extensions.conversion

import hunitalla.Quantity
import hunitalla.Unit
import hunitalla.Unit.Shifter

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
