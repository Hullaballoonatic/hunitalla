package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Hertz

class Frequency(override val value: Double) : Quantity(Hertz, T = -1)
