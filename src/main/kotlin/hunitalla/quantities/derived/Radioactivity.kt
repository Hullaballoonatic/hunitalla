package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.Bq

class Radioactivity(value: Double) : Quantity<Radioactivity>(value, Bq, T = -1)
