package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Sievert

class EquivalentDose(override val value: Double) : Quantity<EquivalentDose>(Sievert, L = 2, T = -2)
