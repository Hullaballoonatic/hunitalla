package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.C

class ElectricCharge(value: Double) : Quantity<ElectricCharge>(value, C, T = 1, I = 1)
