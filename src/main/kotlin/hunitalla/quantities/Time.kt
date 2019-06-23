package hunitalla.quantities

import hunitalla.Quantity
import hunitalla.units.si.s

class Time(value: Double) : Quantity<Time>(value, s, T = 1)
