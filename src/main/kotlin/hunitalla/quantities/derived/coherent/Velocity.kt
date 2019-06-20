package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.MetrePerSecond

class Velocity(override val value: Double) : Quantity(MetrePerSecond, L = 2)
