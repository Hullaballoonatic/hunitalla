package hunitalla.units.scalars.area

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.times
import hunitalla.quantities.derived.coherent.Area
import hunitalla.units.si.derived.coherent.SquareMetre

object Hectare : ScaledUnit<Area>("ha", 1e4 * SquareMetre)
