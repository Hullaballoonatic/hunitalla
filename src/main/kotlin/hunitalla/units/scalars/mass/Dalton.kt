package hunitalla.units.scalars.mass

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.times
import hunitalla.quantities.Mass
import hunitalla.units.si.base.kg

object Dalton : ScaledUnit<Mass>("Unified Mass Unit (Dalton)", "Da", 1.66053906660e-27 * kg)
