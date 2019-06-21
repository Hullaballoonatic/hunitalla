package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.AmperePerMetre

class MagneticFieldStrength(value: Double) : Quantity<MagneticFieldStrength>(value, AmperePerMetre, I = 1, L = -1)
