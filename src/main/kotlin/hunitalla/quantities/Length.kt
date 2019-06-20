package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Metre

class Length(override val value: Double) : Quantity<Length>(Metre, L = 1)
