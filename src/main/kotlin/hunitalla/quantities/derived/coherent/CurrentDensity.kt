package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.SI.AmperePerSquareMetre

class CurrentDensity(value: Double) : Quantity<CurrentDensity>(value, AmperePerSquareMetre, I = 1, L = -2)
