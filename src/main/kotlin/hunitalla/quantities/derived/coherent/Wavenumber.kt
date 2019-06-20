package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.ReciprocalMetre

class Wavenumber(override val value: Double) : Quantity(ReciprocalMetre, L = -1)
