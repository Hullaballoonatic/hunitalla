package hunitalla.units.scalars.angle

import hunitalla.conversion.ScaledUnit
import hunitalla.conversion.div
import hunitalla.quantities.derived.PlaneAngle

object Second : ScaledUnit<PlaneAngle>("\"", Minute / 60)
