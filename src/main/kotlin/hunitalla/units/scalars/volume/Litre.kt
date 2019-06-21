package hunitalla.units.scalars.volume

import hunitalla.conversion.ScaledUnit
import hunitalla.quantities.derived.coherent.Volume
import hunitalla.units.si.derived.coherent.CubicMetre
import hunitalla.conversion.times

object Litre : ScaledUnit<Volume>("L", 1e-3 * CubicMetre)
