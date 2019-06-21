package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.CandelaPerSquareMetre

class Luminance(value: Double) : Quantity<Luminance>(value, CandelaPerSquareMetre, J = 1, L = -2)
