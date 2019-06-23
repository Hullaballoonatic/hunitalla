package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.lm

class LuminousFlux(value: Double) : Quantity<LuminousFlux>(value, lm, J = 1)
