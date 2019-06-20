package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.CubicMetre

class Volume(override val value: Double) : Quantity<Volume>(CubicMetre, L = 3)
