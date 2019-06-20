package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Farad

class Capacitance(override val value: Double) : Quantity<Capacitance>(Farad, M = -1, L = -2, T = 4, I = 2)
