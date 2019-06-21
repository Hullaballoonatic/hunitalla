package hunitalla.units.si.derived.special

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.special.AngularAcceleration
import hunitalla.units.si.base.Second

object RadianPerSecondSquared : SIUnit<AngularAcceleration>("rad/s²", ::AngularAcceleration) {
    override fun times(unit: Unit<*>): Unit<*> = when(unit) {
        Second -> RadianPerSecond
        else -> throw UnrecognizedUnitCombinationError
    }
}
