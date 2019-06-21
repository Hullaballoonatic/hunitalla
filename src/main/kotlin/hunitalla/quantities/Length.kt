package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Metre

class Length(value: Double) : Quantity<Length>(value, Metre, L = 1)
