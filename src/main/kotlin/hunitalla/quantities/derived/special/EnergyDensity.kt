package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.JoulePerCubicMetre

class EnergyDensity(value: Double) : Quantity<EnergyDensity>(value, JoulePerCubicMetre, L = 1, M = 1, T = -2)
