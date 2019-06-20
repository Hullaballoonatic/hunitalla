package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Mole

class AmountOfSubstance(override val value: Double) : Quantity<AmountOfSubstance>(Mole, N = 1)
