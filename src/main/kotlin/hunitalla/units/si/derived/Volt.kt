package hunitalla.units.si.derived

import hunitalla.SIUnit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.EMF
import hunitalla.quantities.derived.Voltage
import hunitalla.units.si.base.A

object Volt : SIUnit<Voltage>("V", ::Voltage)
