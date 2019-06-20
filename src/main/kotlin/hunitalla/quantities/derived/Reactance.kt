package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Ohm

class Reactance(override val value: Double) : Quantity<Reactance>(Ohm, M = 1, L = 2, T = -3, I = -2)
