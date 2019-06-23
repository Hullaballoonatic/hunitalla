package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.lx

class Illuminance(value: Double) : Quantity<Illuminance>(value, lx, L = -2, J = 1)
