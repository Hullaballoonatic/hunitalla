package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.CoulombPerKilogram

class Exposure(value: Double) : Quantity<Exposure>(value, CoulombPerKilogram, M = -1, T = 1, I = 1)
