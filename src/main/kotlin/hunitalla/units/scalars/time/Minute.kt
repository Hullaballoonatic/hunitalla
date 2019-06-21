package hunitalla.units.scalars.time

import hunitalla.conversion.ScaledUnit
import hunitalla.units.si.base.s
import hunitalla.quantities.Time
import hunitalla.conversion.times

object Minute : ScaledUnit<Time>("min", 60 * s)
