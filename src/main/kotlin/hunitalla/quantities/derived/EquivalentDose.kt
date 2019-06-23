package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.Sv

class EquivalentDose(value: Double) : Quantity<EquivalentDose>(value, Sv, L = 2, T = -2)
