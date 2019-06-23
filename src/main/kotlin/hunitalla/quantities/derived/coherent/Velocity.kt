package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.SI.MetrePerSecond

class Velocity(value: Double) : Quantity<Velocity>(value, MetrePerSecond, L = 1, T = -1)
