package hunitalla.quantities.derived.special

import hunitalla.Quantity
import hunitalla.units.si.SI.KatalPerCubicMetre

class CatalyticActivityConcentration(value: Double) :
    Quantity<CatalyticActivityConcentration>(value, KatalPerCubicMetre, L = -3, T = -1, N = 1)
