package hunitalla.units.si.derived

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.PlaneAngle
import hunitalla.units.si.base.Second
import hunitalla.units.si.derived.special.RadianPerSecond

object Radian : SIUnit<PlaneAngle>("rad", ::PlaneAngle)
