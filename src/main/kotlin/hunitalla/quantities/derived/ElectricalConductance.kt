package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Siemens

class ElectricalConductance(override val value: Double) : Quantity(Siemens, M = -1, L = -2, T = 3, I = 2)
