package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.derived.special.NewtonPerMetre

class SurfaceTension(value: Double) : Quantity<SurfaceTension>(value, NewtonPerMetre, M = 1, T = -2)
