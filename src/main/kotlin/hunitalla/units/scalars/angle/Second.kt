package hunitalla.units.scalars.angle

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.div
import hunitalla.quantities.derived.PlaneAngle

object Second : ScaledUnit<PlaneAngle>("\"", Minute / 60)
