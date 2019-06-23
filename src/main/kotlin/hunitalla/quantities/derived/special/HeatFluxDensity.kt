package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.WattPerSquareMetre

class HeatFluxDensity(value: Double) : Quantity<HeatFluxDensity>(value, WattPerSquareMetre, M = 1, T = -3)
