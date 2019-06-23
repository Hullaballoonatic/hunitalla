package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.CoulombPerSquareMetre

class SurfaceChargeDensity(value: Double) :
    Quantity<SurfaceChargeDensity>(value, CoulombPerSquareMetre, L = -2, T = 1, I = 1)
