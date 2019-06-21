package hunitalla.quantities.derived.special

import hunitalla.Quantity

class Entropy(value: Double) : Quantity<HeatCapacity>(value, JoulePerKelvin, L = 2, M = 1, T = -2, Θ = -1)
