package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.NewtonMetre

class MomentOfForce(value: Double) : Quantity<MomentOfForce>(value, NewtonMetre, L = 2, M = 1, T = -2)
