package hunitalla.units.si.derived

import hunitalla.Unit
import hunitalla.quantities.derived.Impedance
import hunitalla.quantities.derived.Reactance
import hunitalla.quantities.derived.Resistance

object Ohm : Unit("Ω", Resistance::class, Impedance::class, Reactance::class)
