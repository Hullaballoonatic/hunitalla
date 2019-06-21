package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.MetrePerSecond

class Velocity(value: Double) : Quantity<Velocity>(value, MetrePerSecond, L = 1, T = -1)
