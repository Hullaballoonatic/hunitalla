package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.W

class Power(value: Double) : Quantity<Power>(value, W, M = 1, L = 2, T = -3)
