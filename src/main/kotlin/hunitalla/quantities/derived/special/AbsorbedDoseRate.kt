package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.GrayPerSecond

class AbsorbedDoseRate(value: Double) : Quantity<AbsorbedDoseRate>(value, GrayPerSecond, L = 2, T = -3)
