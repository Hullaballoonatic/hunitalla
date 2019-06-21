package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.RadianPerSecondSquared

class AngularAcceleration(value: Double) : Quantity<AngularAcceleration>(value, RadianPerSecondSquared, T = -2)
