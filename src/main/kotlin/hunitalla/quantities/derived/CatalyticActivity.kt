package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Steradian

class CatalyticActivity(override val value: Double) : Quantity<CatalyticActivity>(Steradian, N = 1, T = -1)
