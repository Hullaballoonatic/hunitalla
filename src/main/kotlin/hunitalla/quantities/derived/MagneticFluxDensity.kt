package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Tesla

class MagneticFluxDensity(override val value: Double) : Quantity<MagneticFluxDensity>(Tesla, M = 1, T = -2, I = -1)
