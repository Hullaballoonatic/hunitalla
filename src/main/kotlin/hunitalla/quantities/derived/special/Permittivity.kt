package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.FaradPerMetre

class Permittivity(value: Double) : Quantity<Permittivity>(value, FaradPerMetre, L = -3, M = -1, T = 4, I = 2)
