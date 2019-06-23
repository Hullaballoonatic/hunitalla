package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.N

class Weight(value: Double) : Quantity<Force>(value, N, M = 1, L = 1, T = -2)
