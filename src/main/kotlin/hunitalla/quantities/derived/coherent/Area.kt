package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.SI.SquareMetre

class Area(value: Double) : Quantity<Area>(value, SquareMetre, L = 2)
