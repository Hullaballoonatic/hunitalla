package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.m

class Length(value: Double) : Quantity<Length>(value, m, L = 1)
