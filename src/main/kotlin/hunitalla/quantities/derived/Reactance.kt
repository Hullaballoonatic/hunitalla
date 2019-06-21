package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Ohm

class Reactance(value: Double) : Quantity<Resistance>(value, Ohm, M = 1, L = 2, T = -3, I = -2)
