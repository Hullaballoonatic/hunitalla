package hunitalla.quantities

import hunitalla.Dimension
import hunitalla.Quantity
import hunitalla.units.si.base.Kilogram

class Mass(override val value: Double) : Quantity<Mass>(Kilogram, this) {
    companion object : Dimension(M = 1) {
        operator fun invoke(value: Double) = Mass(value)
    }
}
