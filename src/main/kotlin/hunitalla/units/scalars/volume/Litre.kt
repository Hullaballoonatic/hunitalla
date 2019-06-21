package hunitalla.units.scalars.volume

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.times
import hunitalla.quantities.derived.coherent.Volume
import hunitalla.units.si.derived.coherent.CubicMetre

object Litre : ScaledUnit<Volume>("L", 1e-3 * CubicMetre)
