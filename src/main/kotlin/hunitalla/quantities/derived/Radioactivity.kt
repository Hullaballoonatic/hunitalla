package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Becquerel

class Radioactivity(value: Double) : Quantity<Radioactivity>(value, Becquerel, T = -1)
