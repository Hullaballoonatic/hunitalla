package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.CandelaPerSquareMetre

class Luminance(override val value: Double) : Quantity(CandelaPerSquareMetre, J = 1, L = -2)
