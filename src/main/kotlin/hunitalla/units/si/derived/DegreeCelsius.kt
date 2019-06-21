package hunitalla.units.si.derived

import hunitalla.conversion.ShiftedUnit
import hunitalla.conversion.plus
import hunitalla.quantities.Temperature
import hunitalla.units.si.base.K

object DegreeCelsius : ShiftedUnit<Temperature>("°C", K + 273.15)
