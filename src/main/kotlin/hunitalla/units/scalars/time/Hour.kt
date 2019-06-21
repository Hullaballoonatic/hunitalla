package hunitalla.units.scalars.time

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.times
import hunitalla.quantities.Time
import hunitalla.units.scalars.min

object Hour : ScaledUnit<Time>("h", 60 * min)
