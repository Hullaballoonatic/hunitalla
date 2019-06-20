package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Watt

class RadiantFlux(override val value: Double) : Quantity(Watt, M = 1, L = 2, T = -3)
