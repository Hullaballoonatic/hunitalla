package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.WattPerSteradian

class RadiantIntensity(value: Double) : Quantity<RadiantIntensity>(value, WattPerSteradian, L = 2, M = 1, T = -3)
