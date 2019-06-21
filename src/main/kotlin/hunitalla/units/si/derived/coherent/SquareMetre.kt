package hunitalla.units.si.derived.coherent

import hunitalla.Unit.SI
import hunitalla.quantities.derived.coherent.Area
import hunitalla.units.si.derived.sr

object SquareMetre : SI<Area>("m²", ::Area) {
    override operator fun div(unit: SI<*>): SI<*> = when (unit) {
        SquareMetre -> sr
        else -> throw UnrecognizedCombinationError
    }
}
