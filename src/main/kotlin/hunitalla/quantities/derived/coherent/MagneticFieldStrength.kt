package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.AmperePerMetre

class MagneticFieldStrength(override val value: Double) : Quantity<MagneticFieldStrength>(AmperePerMetre, I = 1, L = -1)
