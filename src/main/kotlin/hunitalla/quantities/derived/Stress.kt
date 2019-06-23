package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.Pa

class Stress(value: Double) : Quantity<Pressure>(value, Pa, M = 1, L = -1, T = -2)
