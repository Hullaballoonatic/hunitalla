package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Ampere

class ElectricCurrent(override val value: Double) : Quantity<ElectricCurrent>(Ampere, I = 1)
