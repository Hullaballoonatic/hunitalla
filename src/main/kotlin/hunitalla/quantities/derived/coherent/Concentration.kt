package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.MolePerCubicMetre

class Concentration(value: Double) : Quantity<Concentration>(value, MolePerCubicMetre, N = 1, L = -3)
