package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Volt

class EMF(value: Double) : Quantity<Voltage>(value, Volt, M = 1, L = 2, T = -3, I = -1)
