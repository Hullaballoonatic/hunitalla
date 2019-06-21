package hunitalla.units.si.derived.special

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.special.AngularVelocity
import hunitalla.units.si.base.Second
import hunitalla.units.si.derived.Radian

object RadianPerSecond : SIUnit<AngularVelocity>("rad/s", ::AngularVelocity) {
    override fun times(unit: Unit<*>): Unit<*> = when(unit) {
        Second -> Radian
        else -> throw UnrecognizedUnitCombinationError
    }
    override fun div(unit: Unit<*>): Unit<*> = when(unit) {
        Second -> RadianPerSecondSquared
        else -> throw UnrecognizedUnitCombinationError
    }
}
