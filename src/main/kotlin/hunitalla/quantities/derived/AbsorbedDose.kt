package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Gray

class AbsorbedDose(override val value: Double) : Quantity(Gray, L = 2, T = -2)
