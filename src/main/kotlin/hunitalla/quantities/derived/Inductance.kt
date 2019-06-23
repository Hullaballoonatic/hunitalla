package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.H

class Inductance(value: Double) : Quantity<Inductance>(value, H, M = 1, L = 2, T = -2, I = -2)
