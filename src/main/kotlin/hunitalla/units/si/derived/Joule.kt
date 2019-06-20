package hunitalla.units.si.derived

import hunitalla.Unit
import hunitalla.quantities.derived.Energy
import hunitalla.quantities.derived.Heat
import hunitalla.quantities.derived.Work

object Joule : Unit("J", Energy::class, Work::class, Heat::class)
