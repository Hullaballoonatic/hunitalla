package hunitalla.quantities

import hunitalla.Dimension
import hunitalla.Quantity
import hunitalla.units.si.base.One

class Numeric(override val value: Double) : Quantity<Numeric>(One) {
    companion object : Dimension() {
        operator fun invoke(value: Double) = Numeric(value)
    }
}
