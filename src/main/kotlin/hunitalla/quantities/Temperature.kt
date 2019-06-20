package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Kelvin

class Temperature(override val value: Double) : Quantity<Temperature>(Kelvin, Θ = 1)
