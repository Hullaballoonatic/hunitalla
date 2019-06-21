package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Newton

class Weight(value: Double) : Quantity<Force>(value, Newton, M = 1, L = 1, T = -2)
