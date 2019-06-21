package hunitalla.units.si.derived.coherent

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.coherent.Acceleration
import hunitalla.units.si.base.Second

object MetrePerSecondSquared : SIUnit<Acceleration>("m/s²", ::Acceleration) {
    override fun times(unit: SIUnit<*>): SIUnit<*> = when(unit) {
        Second -> MetrePerSecond
        else -> throw UnrecognizedUnitCombinationError
    }
}
