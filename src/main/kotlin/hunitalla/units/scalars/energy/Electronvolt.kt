package hunitalla.units.scalars.energy

import hunitalla.conversion.ScaledUnit
import hunitalla.quantities.derived.Energy
import hunitalla.units.si.derived.J
import hunitalla.conversion.times

object Electronvolt : ScaledUnit<Energy>("eV", 1.602176634e-19 * J)
