package hunitalla.units.scalars.time

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.times
import hunitalla.quantities.Time
import hunitalla.units.si.base.s

object Minute : ScaledUnit<Time>("min", 60 * s)
