package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.CubicMetrePerKilogram

class SpecificVolume(override val value: Double) : Quantity<SpecificVolume>(CubicMetrePerKilogram, L = 3, M = -1)
