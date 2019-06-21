package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Weber

class MagneticFlux(value: Double) : Quantity<MagneticFlux>(value, Weber, M = 1, L = 2, T = -2, I = -1)
