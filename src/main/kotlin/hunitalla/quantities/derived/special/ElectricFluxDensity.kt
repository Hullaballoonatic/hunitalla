package hunitalla.quantities.derived.special

import hunitalla.Quantity

class ElectricFluxDensity(value: Double) : Quantity<SurfaceChargeDensity>(value, CoulombPerSquareMetre, L = -2, T = 1, I = 1)
