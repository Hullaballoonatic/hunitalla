package hunitalla.helpers.extensions.conversion

import hunitalla.Quantity
import hunitalla.Unit

operator fun <Q : Quantity<Q>> Number.plus(unit: Unit<Q>) = Unit.Shifted.Shifter(this, unit)
operator fun <Q : Quantity<Q>> Double.plus(unit: Unit<Q>) = Unit.Shifted.Shifter(this, unit)
operator fun <Q : Quantity<Q>> Number.plus(si: Unit.SI<Q>) = Unit.Shifted.Shifter(this, si)
operator fun <Q : Quantity<Q>> Double.plus(si: Unit.SI<Q>) = Unit.Shifted.Shifter(this, si)

operator fun <Q : Quantity<Q>> Number.minus(unit: Unit<Q>) = Unit.Shifted.Shifter(this, unit)
operator fun <Q : Quantity<Q>> Double.minus(unit: Unit<Q>) = Unit.Shifted.Shifter(this, unit)
operator fun <Q : Quantity<Q>> Number.minus(si: Unit.SI<Q>) = Unit.Shifted.Shifter(this, si)
operator fun <Q : Quantity<Q>> Double.minus(si: Unit.SI<Q>) = Unit.Shifted.Shifter(this, si)

operator fun <Q : Quantity<Q>> Unit<Q>.plus(shift: Number) = Unit.Shifted.Shifter(shift, this)
operator fun <Q : Quantity<Q>> Unit<Q>.plus(shift: Double) = Unit.Shifted.Shifter(shift, this)
operator fun <Q : Quantity<Q>> Unit.SI<Q>.plus(shift: Number) = Unit.Shifted.Shifter(shift, this)
operator fun <Q : Quantity<Q>> Unit.SI<Q>.plus(shift: Double) = Unit.Shifted.Shifter(shift, this)

operator fun <Q : Quantity<Q>> Unit<Q>.minus(shift: Number) = Unit.Shifted.Shifter(shift, this)
operator fun <Q : Quantity<Q>> Unit<Q>.minus(shift: Double) = Unit.Shifted.Shifter(shift, this)
operator fun <Q : Quantity<Q>> Unit.SI<Q>.minus(shift: Number) = Unit.Shifted.Shifter(shift, this)
operator fun <Q : Quantity<Q>> Unit.SI<Q>.minus(shift: Double) = Unit.Shifted.Shifter(shift, this)

operator fun <Q : Quantity<Q>> Number.plus(shifter: Unit.Shifted.Shifter<Q>) = shifter + this
operator fun <Q : Quantity<Q>> Double.plus(shifter: Unit.Shifted.Shifter<Q>) = shifter + this

operator fun <Q : Quantity<Q>> Number.minus(shifter: Unit.Shifted.Shifter<Q>) = -shifter + this
operator fun <Q : Quantity<Q>> Double.minus(shifter: Unit.Shifted.Shifter<Q>) = shifter + this
