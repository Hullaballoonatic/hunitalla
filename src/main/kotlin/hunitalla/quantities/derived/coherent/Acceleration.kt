package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.MetrePerSecondSquared

class Acceleration(override val value: Double) : Quantity<Acceleration>(MetrePerSecondSquared, L = 1, T = -2)
