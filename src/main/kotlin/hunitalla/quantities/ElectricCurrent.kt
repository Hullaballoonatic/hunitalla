package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.A

class ElectricCurrent(value: Double) : Quantity<ElectricCurrent>(value, A, I = 1)
