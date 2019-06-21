package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Pascal

class Stress(value: Double) : Quantity<Pressure>(value, Pascal, M = 1, L = -1, T = -2)
