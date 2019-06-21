package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Henry

class Inductance(value: Double) : Quantity<Inductance>(value, Henry, M = 1, L = 2, T = -2, I = -2)
