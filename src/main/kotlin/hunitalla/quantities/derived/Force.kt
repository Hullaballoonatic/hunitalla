package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Newton

class Force(override val value: Double) : Quantity<Force>(Newton, L = 1, M = 1, T = -2)
