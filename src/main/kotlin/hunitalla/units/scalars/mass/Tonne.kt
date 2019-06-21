package hunitalla.units.scalars.mass

import hunitalla.conversion.ScaledUnit
import hunitalla.conversion.times
import hunitalla.quantities.Mass
import hunitalla.units.si.base.kg

object Tonne : ScaledUnit<Mass>("Tonne (metric ton)", "t", 1000 * kg)
