package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.CandelaPerSquareMetre

class Luminance(override val value: Double) : Quantity<Luminance>(CandelaPerSquareMetre, J = 1, L = -2)
