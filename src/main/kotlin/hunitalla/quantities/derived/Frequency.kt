package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Hertz

class Frequency(override val value: Double) : Quantity<Frequency>(Hertz, T = -1)
