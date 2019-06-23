package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.F

class Capacitance(value: Double) : Quantity<Capacitance>(value, F, M = -1, L = -2, T = 4, I = 2)
