package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Katal

class CatalyticActivity(value: Double) : Quantity<CatalyticActivity>(value, Katal, N = 1, T = -1)
