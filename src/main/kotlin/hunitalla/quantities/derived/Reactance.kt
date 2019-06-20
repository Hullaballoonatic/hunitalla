package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Ohm

class Reactance(override val value: Double) : Quantity(Ohm, M = 1, L = 2, T = -3, I = -2)
