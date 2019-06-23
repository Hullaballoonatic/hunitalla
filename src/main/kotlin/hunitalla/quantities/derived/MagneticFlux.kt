package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.Wb

class MagneticFlux(value: Double) : Quantity<MagneticFlux>(value, Wb, M = 1, L = 2, T = -2, I = -1)
