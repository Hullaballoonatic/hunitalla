package hunitalla.units.scalars.angle

import hunitalla.ScalarUnit
import hunitalla.quantities.derived.PlaneAngle
import hunitalla.units.si.derived.rad
import kotlin.math.PI
import hunitalla.times

object Degree : ScalarUnit<PlaneAngle>("°", PI * rad / 180)
