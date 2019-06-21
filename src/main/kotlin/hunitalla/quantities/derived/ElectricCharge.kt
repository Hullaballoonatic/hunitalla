package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Coulomb

class ElectricCharge(value: Double) : Quantity<ElectricCharge>(value, Coulomb, T = 1, I = 1)
