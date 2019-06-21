package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Lumen

class LuminousFlux(value: Double) : Quantity<LuminousFlux>(value, Lumen, J = 1)
