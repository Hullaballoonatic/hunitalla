package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.WattPerSquareMetre

class HeatFluxDensity(value: Double) : Quantity<HeatFluxDensity>(value, WattPerSquareMetre, M = 1, T = -3)
