package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.RadianPerSecond

class AngularVelocity(value: Double) : Quantity<AngularVelocity>(value, RadianPerSecond, T = -1)
