package hunitalla.units.scalars.energy

import hunitalla.Unit.ScaledUnit
import hunitalla.helpers.extensions.conversion.times
import hunitalla.quantities.derived.Energy
import hunitalla.units.si.derived.J

object Electronvolt : ScaledUnit<Energy>("eV", 1.602176634e-19 * J)
