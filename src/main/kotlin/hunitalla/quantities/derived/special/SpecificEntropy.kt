package hunitalla.quantities.derived.special

import hunitalla.Quantity

class SpecificEntropy(value: Double) : Quantity<SpecificHeatCapacity>(value, JoulePerKilogramKelvin, L = 2, T = -2, Θ = -1)
