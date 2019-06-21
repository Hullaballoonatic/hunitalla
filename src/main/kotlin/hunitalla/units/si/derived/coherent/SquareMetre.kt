package hunitalla.units.si.derived.coherent

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.coherent.*
import hunitalla.units.scalars.volume.L
import hunitalla.units.si.base.Metre
import hunitalla.units.si.base.m
import hunitalla.units.si.derived.sr

object SquareMetre : SIUnit<Area>("m²", ::Area) {
    override operator fun div(unit: SIUnit<*>): SIUnit<*> = when(unit) {
        SquareMetre -> sr
        else -> super.times(unit)
    }
}
