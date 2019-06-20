package hunitalla.quantities

import hunitalla.Dimension
import hunitalla.Quantity
import hunitalla.units.si.base.Metre

class Length(override val value: Double) : Quantity<Length>(Metre, this) {
    companion object : Dimension(L = 1) {
        operator fun invoke(value: Double) = Length(value)
    }
}
