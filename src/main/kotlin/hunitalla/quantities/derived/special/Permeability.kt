package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.HenryPerMetre

class Permeability(value: Double) : Quantity<Permeability>(value, HenryPerMetre, L = 1, M = 1, T = -2, I = -2)
