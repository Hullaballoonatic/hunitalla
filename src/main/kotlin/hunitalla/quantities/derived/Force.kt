package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Newton

class Force(value: Double) : Quantity<Force>(value, Newton, L = 1, M = 1, T = -2)
