package hunitalla.quantities.derived.coherent

import hunitalla.Quantity
import hunitalla.units.si.derived.coherent.ReciprocalMetre

class Wavenumber(override val value: Double) : Quantity<Wavenumber>(ReciprocalMetre, L = -1)
