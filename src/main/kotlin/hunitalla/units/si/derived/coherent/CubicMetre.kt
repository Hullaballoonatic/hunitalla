package hunitalla.units.si.derived.coherent

import hunitalla.Unit.SI
import hunitalla.quantities.derived.coherent.Volume
import hunitalla.units.si.base.Metre

object CubicMetre : SI<Volume>("m³", ::Volume) {
    override fun div(unit: SI<*>): SI<*> = when (unit) {
        Metre -> SquareMetre
        else -> throw UnrecognizedCombinationError
    }
}
