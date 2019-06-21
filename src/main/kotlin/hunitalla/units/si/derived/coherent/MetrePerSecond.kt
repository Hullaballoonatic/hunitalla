package hunitalla.units.si.derived.coherent

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.coherent.Velocity
import hunitalla.units.si.base.Second
import hunitalla.units.si.base.m

object MetrePerSecond : SIUnit<Velocity>("m/s", ::Velocity) {
    override fun times(unit: SIUnit<*>): SIUnit<*> = when(unit) {
        Second -> m
        else -> throw UnrecognizedUnitCombinationError
    }
    override fun div(unit: SIUnit<*>): SIUnit<*> = when(unit) {
        Second -> MetrePerSecondSquared
        else -> throw UnrecognizedUnitCombinationError
    }
}
