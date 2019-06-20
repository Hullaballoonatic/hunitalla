package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Pascal

class Pressure(override val value: Double) : Quantity<Pressure>(Pascal, M = 1, L = -1, T = -2)
