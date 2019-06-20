package hunitalla.quantities.derived

import hunitalla.Quantity
import hunitalla.units.si.derived.Coulomb

class ElectricCharge(override val value: Double) : Quantity(Coulomb, T = 1, I = 1)
