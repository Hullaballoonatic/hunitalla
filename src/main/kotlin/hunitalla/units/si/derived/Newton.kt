package hunitalla.units.si.derived

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.*
import hunitalla.units.si.base.Metre
import hunitalla.units.si.derived.coherent.SquareMetre

object Newton : SIUnit<Force>("N", ::Force)
