package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.V

class EMF(value: Double) : Quantity<Voltage>(value, V, M = 1, L = 2, T = -3, I = -1)
