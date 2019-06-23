package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.JoulePerKilogram

class SpecificEnergy(value: Double) : Quantity<SpecificEnergy>(value, JoulePerKilogram, L = 2, T = -2)
