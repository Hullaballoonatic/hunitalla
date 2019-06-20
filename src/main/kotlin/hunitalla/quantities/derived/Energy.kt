package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Joule

class Energy(override val value: Double) : Quantity(Joule, M = 1, L = 2, T = -2)
