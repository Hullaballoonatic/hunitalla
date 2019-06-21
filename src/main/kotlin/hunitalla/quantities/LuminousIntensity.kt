package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Candela

class LuminousIntensity(value: Double) : Quantity<LuminousIntensity>(value, Candela, J = 1)
