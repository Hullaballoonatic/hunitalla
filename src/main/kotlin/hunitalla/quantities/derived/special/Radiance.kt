package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.WattPerSquareMetreSteradian

class Radiance(value: Double) : Quantity<Radiance>(value, WattPerSquareMetreSteradian, M = 1, T = -3)
