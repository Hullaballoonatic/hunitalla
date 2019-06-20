package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Kilogram

class Mass(override val value: Double) : Quantity<Mass>(Kilogram, M = 1)
