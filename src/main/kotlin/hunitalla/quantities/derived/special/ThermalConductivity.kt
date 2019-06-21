package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.WattPerMetreKelvin

class ThermalConductivity(value: Double) :
    Quantity<ThermalConductivity>(value, WattPerMetreKelvin, L = 1, M = 1, T = -3, Θ = -1)
