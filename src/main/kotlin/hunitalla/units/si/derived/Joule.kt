package hunitalla.units.si.derived

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.Energy
import hunitalla.quantities.derived.Heat
import hunitalla.quantities.derived.Work
import hunitalla.units.si.base.Kilogram
import hunitalla.units.si.base.Second

object Joule : SIUnit<Energy>("J", ::Energy)
