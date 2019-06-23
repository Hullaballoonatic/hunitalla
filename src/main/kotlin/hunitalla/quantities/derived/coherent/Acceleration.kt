package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.SI.MetrePerSecondSquared

class Acceleration(value: Double) : Quantity<Acceleration>(value, MetrePerSecondSquared, L = 1, T = -2)
