package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.WattPerSquareMetreSteradian

class Radiance(value: Double) : Quantity<Radiance>(value, WattPerSquareMetreSteradian, M = 1, T = -3)
