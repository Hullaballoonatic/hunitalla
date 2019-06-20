package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Candela

class LuminousIntensity(override val value: Double) : Quantity<LuminousIntensity>(Candela, J = 1)
