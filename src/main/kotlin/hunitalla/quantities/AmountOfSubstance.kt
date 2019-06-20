package hunitalla.quantities

import hunitalla.Dimension
import hunitalla.Quantity
import hunitalla.units.si.base.Mole

class AmountOfSubstance(override val value: Double) : Quantity<AmountOfSubstance>(Mole, this) {
    companion object : Dimension(N = 1) {
        operator fun invoke(value: Double) = AmountOfSubstance(value)
    }
}
