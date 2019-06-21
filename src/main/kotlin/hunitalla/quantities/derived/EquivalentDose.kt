package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Sievert

class EquivalentDose(value: Double) : Quantity<EquivalentDose>(value, Sievert, L = 2, T = -2)
