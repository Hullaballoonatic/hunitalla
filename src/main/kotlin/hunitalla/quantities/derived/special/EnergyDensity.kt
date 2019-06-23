package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.JoulePerCubicMetre

class EnergyDensity(value: Double) : Quantity<EnergyDensity>(value, JoulePerCubicMetre, L = 1, M = 1, T = -2)
