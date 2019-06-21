package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Ampere

class ElectricCurrent(value: Double) : Quantity<ElectricCurrent>(value, Ampere, I = 1)
