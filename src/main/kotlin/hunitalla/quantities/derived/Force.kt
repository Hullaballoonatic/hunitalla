package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.N

class Force(value: Double) : Quantity<Force>(value, N, L = 1, M = 1, T = -2)
