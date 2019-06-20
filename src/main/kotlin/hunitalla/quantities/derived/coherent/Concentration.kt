package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.MolePerCubicMetre

class Concentration(override val value: Double) : Quantity<Concentration>(MolePerCubicMetre, N = 1, L = -3)
