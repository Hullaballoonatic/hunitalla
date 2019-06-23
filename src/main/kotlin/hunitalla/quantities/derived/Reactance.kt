package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.Ω

class Reactance(value: Double) : Quantity<Resistance>(value, Ω, M = 1, L = 2, T = -3, I = -2)
