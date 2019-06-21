package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Farad

class Capacitance(value: Double) : Quantity<Capacitance>(value, Farad, M = -1, L = -2, T = 4, I = 2)
