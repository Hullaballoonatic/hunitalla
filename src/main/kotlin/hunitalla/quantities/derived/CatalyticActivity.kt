package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Katal

class CatalyticActivity(override val value: Double) : Quantity<CatalyticActivity>(Katal, N = 1, T = -1)
