package hunitalla.units.scalars.mass

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.times
import hunitalla.quantities.Mass
import hunitalla.units.si.base.kg

object Gram : ScaledUnit<Mass>("g", 1e-3 * kg)
