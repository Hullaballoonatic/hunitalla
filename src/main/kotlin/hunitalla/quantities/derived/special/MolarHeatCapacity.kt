package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.JoulePerMoleKelvin

class MolarHeatCapacity(value: Double) :
    Quantity<MolarHeatCapacity>(value, JoulePerMoleKelvin, L = 2, M = 1, T = -2, Θ = -1, N = -1)
