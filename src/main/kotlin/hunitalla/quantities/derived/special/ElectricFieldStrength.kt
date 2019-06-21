package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.VoltPerMetre

class ElectricFieldStrength(value: Double) :
    Quantity<ElectricFieldStrength>(value, VoltPerMetre, L = 1, M = 1, T = -3, I = -1)
