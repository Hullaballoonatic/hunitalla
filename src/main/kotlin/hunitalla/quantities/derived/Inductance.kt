package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Henry

class Inductance(override val value: Double) : Quantity(Henry, M = 1, L = 2, T = -2, I = -2)
