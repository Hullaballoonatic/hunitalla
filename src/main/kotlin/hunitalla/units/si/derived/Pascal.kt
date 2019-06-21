package hunitalla.units.si.derived

import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError
import hunitalla.quantities.derived.Pressure
import hunitalla.quantities.derived.Stress
import hunitalla.units.scalars.volume.Litre
import hunitalla.units.si.derived.coherent.CubicMetre

object Pascal : SIUnit<Pressure>("Pa", ::Pressure)
