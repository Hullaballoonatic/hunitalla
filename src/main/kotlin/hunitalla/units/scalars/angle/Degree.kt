package hunitalla.units.scalars.angle

import hunitalla.conversion.ScaledUnit
import hunitalla.quantities.derived.PlaneAngle
import hunitalla.units.si.derived.rad
import kotlin.math.PI
import hunitalla.conversion.times

object Degree : ScaledUnit<PlaneAngle>("°", PI * rad / 180)
