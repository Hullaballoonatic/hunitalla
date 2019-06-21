package hunitalla.units.si.base

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.Length
import hunitalla.units.si.derived.coherent.CubicMetre
import hunitalla.units.si.derived.coherent.MetrePerSecond
import hunitalla.units.si.derived.coherent.ReciprocalMetre
import hunitalla.units.si.derived.coherent.SquareMetre
import hunitalla.units.si.derived.rad

object Metre : SIUnit<Length>("m", ::Length) {
    override operator fun div(unit: SIUnit<*>): SIUnit<*> = when(unit) {
        Metre -> rad
        else -> super.div(unit)
    }
}

