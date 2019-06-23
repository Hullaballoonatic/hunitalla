package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.SI.KilogramPerCubicMetre

class MassConcentration(value: Double) : Quantity<Density>(value, KilogramPerCubicMetre, M = 1, L = -3)
