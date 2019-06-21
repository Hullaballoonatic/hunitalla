package hunitalla.units.scalars.angle

import hunitalla.conversion.ScaledUnit
import hunitalla.conversion.div
import hunitalla.quantities.derived.PlaneAngle

object Minute : ScaledUnit<PlaneAngle>("\'", Degree / 60)
