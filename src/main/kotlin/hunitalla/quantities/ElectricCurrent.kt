package hunitalla.quantities

import hunitalla.Dimension
import hunitalla.Quantity
import hunitalla.units.si.base.Ampere

class ElectricCurrent(override val value: Double) : Quantity<ElectricCurrent>(Ampere, this) {
    companion object : Dimension(I = 1) {
        operator fun invoke(value: Double) = ElectricCurrent(value)
    }
}
