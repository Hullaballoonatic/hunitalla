package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.KilogramPerCubicMetre

class Density(override val value: Double) : Quantity<Density>(KilogramPerCubicMetre, M = 1, L = -3)
