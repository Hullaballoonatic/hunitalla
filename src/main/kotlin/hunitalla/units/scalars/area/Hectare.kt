package hunitalla.units.scalars.area

import hunitalla.conversion.ScaledUnit
import hunitalla.quantities.derived.coherent.Area
import hunitalla.units.si.derived.coherent.SquareMetre
import hunitalla.conversion.times

object Hectare : ScaledUnit<Area>("ha", 1e4 * SquareMetre)
