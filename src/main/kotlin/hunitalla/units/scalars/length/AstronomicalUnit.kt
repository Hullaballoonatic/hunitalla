package hunitalla.units.scalars.length

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.times
import hunitalla.quantities.Length
import hunitalla.units.si.base.m

object AstronomicalUnit : ScaledUnit<Length>("au", 149597870700 * m)
