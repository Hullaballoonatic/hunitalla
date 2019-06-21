package hunitalla.quantities.derived.special

import hunitalla.Quantity

class DynamicViscosity(value: Double) : Quantity<DynamicViscosity>(value, PascalSecond, L = -1, M = 1, T = -1)
