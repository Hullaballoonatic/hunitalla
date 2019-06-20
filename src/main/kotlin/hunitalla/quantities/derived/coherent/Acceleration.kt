package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.MetrePerSecondSquared

class Acceleration(override val value: Double) : Quantity(MetrePerSecondSquared, L = 2)
