package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.T

class MagneticFluxDensity(value: Double) : Quantity<MagneticFluxDensity>(value, T, M = 1, T = -2, I = -1)
