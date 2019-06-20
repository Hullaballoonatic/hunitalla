package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Becquerel

class Radioactivity(override val value: Double) : Quantity(Becquerel, T = -1)