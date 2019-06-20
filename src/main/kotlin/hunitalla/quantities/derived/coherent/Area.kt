package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.*

class Area(override val value: Double) : Quantity<Area>(SquareMetre, L = 2)
