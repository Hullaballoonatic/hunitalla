package hunitalla.quantities

import hunitalla.Dimension
import hunitalla.Quantity
import hunitalla.units.si.base.Kelvin

class Temperature(override val value: Double) : Quantity<Temperature>(Kelvin, this) {
    companion object : Dimension(Θ = 1) {
        operator fun invoke(value: Double) = Temperature(value)
    }
}
