package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.mol

class AmountOfSubstance(value: Double) : Quantity<AmountOfSubstance>(value, mol, N = 1)
