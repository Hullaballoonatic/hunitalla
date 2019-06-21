package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Gray

class AbsorbedDose(value: Double) : Quantity<AbsorbedDose>(value, Gray, L = 2, T = -2)
