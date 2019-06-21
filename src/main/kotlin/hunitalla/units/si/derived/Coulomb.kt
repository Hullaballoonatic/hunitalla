package hunitalla.units.si.derived

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.ElectricCharge
import hunitalla.units.si.base.A
import hunitalla.units.si.base.Second
import hunitalla.units.si.base.s
import hunitalla.units.si.derived.coherent.MetrePerSecondSquared

object Coulomb : SIUnit<ElectricCharge>("C", ::ElectricCharge)
