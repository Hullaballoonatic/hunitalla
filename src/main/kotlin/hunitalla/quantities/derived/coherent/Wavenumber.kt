package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.SI.ReciprocalMetre

class Wavenumber(value: Double) : Quantity<Wavenumber>(value, ReciprocalMetre, L = -1)
