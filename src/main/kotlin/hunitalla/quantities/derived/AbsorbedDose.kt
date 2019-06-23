package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.Gy

class AbsorbedDose(value: Double) : Quantity<AbsorbedDose>(value, Gy, L = 2, T = -2)
