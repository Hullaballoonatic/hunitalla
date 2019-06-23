package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.cd

class LuminousIntensity(value: Double) : Quantity<LuminousIntensity>(value, cd, J = 1)
