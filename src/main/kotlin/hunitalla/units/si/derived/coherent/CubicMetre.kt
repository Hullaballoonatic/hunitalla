package hunitalla.units.si.derived.coherent

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.coherent.Volume
import hunitalla.units.si.base.Metre
import hunitalla.units.si.base.Second

object CubicMetre : SIUnit<Volume>("m³", ::Volume) {
    override fun div(unit: SIUnit<*>): SIUnit<*> = when(unit) {
        Metre -> SquareMetre
        else -> throw UnrecognizedUnitCombinationError
    }
}
