package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Tesla

class MagneticFluxDensity(value: Double) : Quantity<MagneticFluxDensity>(value, Tesla, M = 1, T = -2, I = -1)
