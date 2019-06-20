package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.One

class Numeric(override val value: Double) : Quantity<Numeric>(One)
