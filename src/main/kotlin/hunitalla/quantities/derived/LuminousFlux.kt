package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Lumen

class LuminousFlux(override val value: Double) : Quantity(Lumen, J = 1)
