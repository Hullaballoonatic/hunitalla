package hunitalla.units.si.derived

import hunitalla.SIUnit
import hunitalla.quantities.derived.Power
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.units.si.base.Ampere
import hunitalla.units.si.derived.coherent.SquareMetre
import hunitalla.units.si.derived.special.WattPerSquareMetre
import hunitalla.units.si.derived.special.WattPerSteradian

object Watt : SIUnit<Power>("W", ::Power)
