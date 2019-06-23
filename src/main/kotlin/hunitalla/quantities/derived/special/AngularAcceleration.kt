package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.RadianPerSecondSquared

class AngularAcceleration(value: Double) : Quantity<AngularAcceleration>(value, RadianPerSecondSquared, T = -2)
