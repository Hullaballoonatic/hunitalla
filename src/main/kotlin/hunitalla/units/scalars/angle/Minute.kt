package hunitalla.units.scalars.angle

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.div
import hunitalla.quantities.derived.PlaneAngle

object Minute : ScaledUnit<PlaneAngle>("\'", Degree / 60)
