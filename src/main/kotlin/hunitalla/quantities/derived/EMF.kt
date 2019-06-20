package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Volt

class EMF(override val value: Double) : Quantity(Volt, M = 1, L = 2, T = -3, I = -1)
