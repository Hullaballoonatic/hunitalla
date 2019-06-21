package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Hertz

class Frequency(value: Double) : Quantity<Frequency>(value, Hertz, T = -1)
