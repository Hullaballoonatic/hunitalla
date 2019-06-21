package hunitalla.units.scalars.angle

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.times
import hunitalla.quantities.derived.PlaneAngle
import hunitalla.units.si.derived.rad
import kotlin.math.PI

object Degree : ScaledUnit<PlaneAngle>("°", PI * rad / 180)
