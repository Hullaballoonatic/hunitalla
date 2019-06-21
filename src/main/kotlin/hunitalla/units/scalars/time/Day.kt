package hunitalla.units.scalars.time

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.times
import hunitalla.quantities.Time
import hunitalla.units.scalars.h

object Day : ScaledUnit<Time>("d", 24 * h)
