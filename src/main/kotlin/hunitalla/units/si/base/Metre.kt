package hunitalla.units.si.base

import hunitalla.Unit.SI
import hunitalla.quantities.Length
import hunitalla.units.si.derived.rad

object Metre : SI<Length>("m", ::Length) {
    override operator fun div(unit: SI<*>): SI<*> = when (unit) {
        Metre -> rad
        else -> super.div(unit)
    }
}

