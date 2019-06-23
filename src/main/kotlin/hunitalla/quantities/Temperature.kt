package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.K

class Temperature(value: Double) : Quantity<Temperature>(value, K, Θ = 1)
