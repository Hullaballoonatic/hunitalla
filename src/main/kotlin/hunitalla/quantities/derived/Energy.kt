package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.J

class Energy(value: Double) : Quantity<Energy>(value, J, M = 1, L = 2, T = -2)
