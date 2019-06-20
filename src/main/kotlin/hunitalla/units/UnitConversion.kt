package hunitalla.units

import hunitalla.Unit
import hunitalla.helpers.attributes.Converter

interface UnitConversion <F: Unit, T: Unit> : Converter<F, T> {
}
