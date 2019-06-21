package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.base.Second

class Time(value: Double) : Quantity<Time>(value, Second, T = 1)
