package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.SI.KilogramPerSquareMetre

class SurfaceDensity(value: Double) : Quantity<SurfaceDensity>(value, KilogramPerSquareMetre, M = 1, L = -2)
