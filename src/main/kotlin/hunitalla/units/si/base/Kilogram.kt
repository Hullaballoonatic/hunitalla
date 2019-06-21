package hunitalla.units.si.base

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.Mass
import hunitalla.units.si.derived.N
import hunitalla.units.si.derived.coherent.MetrePerSecondSquared

object Kilogram : SIUnit<Mass>("g", ::Mass) {
    override fun times(unit: SIUnit<*>): SIUnit<*> = when(unit) {
        MetrePerSecondSquared -> N
        else -> throw UnrecognizedUnitCombinationError
    }
}
