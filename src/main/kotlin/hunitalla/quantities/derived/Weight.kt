package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Newton

class Weight(override val value: Double) : Quantity<Force>(Newton, M = 1, L = 1, T = -2)
