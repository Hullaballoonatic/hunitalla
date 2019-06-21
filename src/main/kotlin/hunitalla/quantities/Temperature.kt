package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Kelvin

class Temperature(value: Double) : Quantity<Temperature>(value, Kelvin, Θ = 1)
