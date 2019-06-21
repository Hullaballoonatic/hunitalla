package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Mole

class AmountOfSubstance(value: Double) : Quantity<AmountOfSubstance>(value, Mole, N = 1)
