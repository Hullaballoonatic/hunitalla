package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.CubicMetrePerKilogram

class SpecificVolume(value: Double) : Quantity<SpecificVolume>(value, CubicMetrePerKilogram, L = 3, M = -1)
