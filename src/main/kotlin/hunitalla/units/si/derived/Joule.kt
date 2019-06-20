package hunitalla.units.si.derived

import hunitalla.SIUnit
import hunitalla.quantities.derived.Energy
import hunitalla.quantities.derived.Heat
import hunitalla.quantities.derived.Work

object Joule : SIUnit<Energy>("J", ::Energy)
