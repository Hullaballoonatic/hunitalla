package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Watt

class Power(value: Double) : Quantity<Power>(value, Watt, M = 1, L = 2, T = -3)
