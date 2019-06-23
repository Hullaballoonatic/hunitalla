package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.Hz

class Frequency(value: Double) : Quantity<Frequency>(value, Hz, T = -1)
