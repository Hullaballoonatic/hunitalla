package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.JoulePerMole

class MolarEnergy(value: Double) : Quantity<MolarEnergy>(value, JoulePerMole, L = 2, M = 1, T = -2, N = -1)
