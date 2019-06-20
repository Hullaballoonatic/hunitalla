package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Joule

class Work(override val value: Double) : Quantity<Work>(Joule, M = 1, L = 2, T = -2)
