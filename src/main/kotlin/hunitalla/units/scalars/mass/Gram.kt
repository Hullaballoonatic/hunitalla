package hunitalla.units.scalars.mass

import hunitalla.conversion.ScaledUnit
import hunitalla.quantities.Mass
import hunitalla.units.si.base.kg
import hunitalla.conversion.times

object Gram : ScaledUnit<Mass>("g", 1e-3 * kg)
