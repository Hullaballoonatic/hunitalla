package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Joule

class Heat(value: Double) : Quantity<Energy>(value, Joule, M = 1, L = 2, T = -2)
