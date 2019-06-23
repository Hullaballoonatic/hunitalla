package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.kat

class CatalyticActivity(value: Double) : Quantity<CatalyticActivity>(value, kat, N = 1, T = -1)
