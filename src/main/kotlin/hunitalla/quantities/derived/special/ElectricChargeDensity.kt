package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.CoulombPerCubicMetre

class ElectricChargeDensity(value: Double) :
    Quantity<ElectricChargeDensity>(value, CoulombPerCubicMetre, L = -3, T = 1, I = 1)
