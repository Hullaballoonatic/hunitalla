package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.JoulePerKelvin

class HeatCapacity(value: Double) : Quantity<HeatCapacity>(value, JoulePerKelvin, L = 2, M = 1, T = -2, Θ = -1)
