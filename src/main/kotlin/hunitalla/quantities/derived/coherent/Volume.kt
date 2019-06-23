package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.SI.CubicMetre

class Volume(value: Double) : Quantity<Volume>(value, CubicMetre, L = 3)
