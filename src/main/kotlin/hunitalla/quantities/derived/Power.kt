package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Watt

class Power(override val value: Double) : Quantity<Power>(Watt, M = 1, L = 2, T = -3)
