package hunitalla.units.si.derived

import hunitalla.SIUnit
import hunitalla.quantities.derived.Impedance
import hunitalla.quantities.derived.Reactance
import hunitalla.quantities.derived.Resistance

object Ohm : SIUnit<Resistance>("Ω", ::Resistance)
