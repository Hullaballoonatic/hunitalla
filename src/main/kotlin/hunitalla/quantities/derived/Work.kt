package hunitalla.quantities.derived

import hunitalla.Dimension
import hunitalla.Quantity
import hunitalla.units.si.derived.Joule

class Work(override val value: Double) : Quantity<Work>(Joule, this) {
    companion object : Dimension(M = 1, L = 2, T = -2) {

    }
}
