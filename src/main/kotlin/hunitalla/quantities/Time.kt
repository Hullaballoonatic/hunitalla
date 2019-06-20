package hunitalla.quantities

import hunitalla.Dimension
import hunitalla.Quantity
import hunitalla.units.si.base.Second

class Time(override val value: Double) : Quantity<Time>(Second, this) {
    companion object : Dimension(T = 1) {
        operator fun invoke(value: Double) = Time(value)
    }
}
