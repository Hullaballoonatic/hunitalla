package hunitalla.units.si.derived

import hunitalla.Unit.Shifted
import hunitalla.helpers.extensions.conversion.plus
import hunitalla.quantities.Temperature
import hunitalla.units.si.base.K

object DegreeCelsius : Shifted<Temperature>("°C", K + 273.15)
