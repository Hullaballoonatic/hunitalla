package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.KilogramPerCubicMetre

class MassConcentration(override val value: Double) : Quantity<MassConcentration>(KilogramPerCubicMetre, M = 1, L = -3)
