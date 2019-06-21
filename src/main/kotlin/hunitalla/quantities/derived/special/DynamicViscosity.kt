package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.PascalSecond

class DynamicViscosity(value: Double) : Quantity<DynamicViscosity>(value, PascalSecond, L = -1, M = 1, T = -1)
