package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.kg

class Mass(value: Double) : Quantity<Mass>(value, kg, M = 1)
