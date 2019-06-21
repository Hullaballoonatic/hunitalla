package hunitalla.units.si.base

import hunitalla.SIUnit
import hunitalla.quantities.Numeric
import hunitalla.Unit
import hunitalla.helpers.errors.UnrecognizedUnitCombinationError

object One : SIUnit<Numeric>("1", ::Numeric) {
    override fun times(unit: SIUnit<*>): SIUnit<*> = unit
    override fun div(unit: SIUnit<*>): SIUnit<*> = unit.inverse
    override infix fun pow(exponent: Int) = this
    override val inverse = this
}
