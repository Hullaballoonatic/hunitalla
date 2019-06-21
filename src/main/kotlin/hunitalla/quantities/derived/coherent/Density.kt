package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.KilogramPerCubicMetre

class Density(value: Double) : Quantity<Density>(value, KilogramPerCubicMetre, M = 1, L = -3)
