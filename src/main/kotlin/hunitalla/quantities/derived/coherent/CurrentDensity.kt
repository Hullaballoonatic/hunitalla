package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.AmperePerSquareMetre

class CurrentDensity(override val value: Double) : Quantity(AmperePerSquareMetre, I = 1, L = -2)
