package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Volt

class Voltage(override val value: Double) : Quantity<Voltage>(Volt, M = 1, L = 2, T = -3, I = -1)
