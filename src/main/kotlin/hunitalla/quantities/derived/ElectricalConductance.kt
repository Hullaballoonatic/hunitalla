package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Siemens

class ElectricalConductance(value: Double) : Quantity<ElectricalConductance>(value, Siemens, M = -1, L = -2, T = 3, I = 2)
