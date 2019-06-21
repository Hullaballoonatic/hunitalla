package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Lux

class Illuminance(value: Double) : Quantity<Illuminance>(value, Lux, L = -2, J = 1)
