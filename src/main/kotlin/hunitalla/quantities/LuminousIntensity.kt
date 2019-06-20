package hunitalla.quantities

import hunitalla.Dimension
import hunitalla.Quantity
import hunitalla.units.si.base.Candela

class LuminousIntensity(override val value: Double) : Quantity<LuminousIntensity>(Candela, J = 1) {
    companion object : Dimension(J = 1) {
        operator fun invoke(value: Double) = LuminousIntensity(value)
    }
}
