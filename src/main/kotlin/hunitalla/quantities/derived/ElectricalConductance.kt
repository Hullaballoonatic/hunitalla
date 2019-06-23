package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.S

class ElectricalConductance(value: Double) : Quantity<ElectricalConductance>(value, S, M = -1, L = -2, T = 3, I = 2)
