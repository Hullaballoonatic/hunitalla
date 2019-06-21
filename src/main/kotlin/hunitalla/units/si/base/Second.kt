package hunitalla.units.si.base

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.Time
import hunitalla.units.si.derived.C
import hunitalla.units.si.derived.Hz

object Second : SIUnit<Time>("s", ::Time)
