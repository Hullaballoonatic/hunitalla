package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.KilogramPerSquareMetre

class SurfaceDensity(override val value: Double) : Quantity<SurfaceDensity>(KilogramPerSquareMetre, M = 1, L = -2)
