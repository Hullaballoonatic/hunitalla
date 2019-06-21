package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Kilogram

class Mass(value: Double) : Quantity<Mass>(value, Kilogram, M = 1)
