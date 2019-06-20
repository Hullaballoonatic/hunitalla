package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Lux

class Illuminance(override val value: Double) : Quantity<Illuminance>(Lux, L = -2, J = 1)
