package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Weber

class MagneticFlux(override val value: Double) : Quantity(Weber, M = 1, L = 2, T = -2, I = -1)
