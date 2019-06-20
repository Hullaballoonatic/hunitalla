package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Second

class Time(override val value: Double) : Quantity<Time>(Second, T = 1)
