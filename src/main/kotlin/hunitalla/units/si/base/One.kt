package hunitalla.units.si.base

import hunitalla.Unit.SI
import hunitalla.quantities.Numeric

object One : SI<Numeric>("1", ::Numeric) {
    override fun times(unit: SI<*>): SI<*> = unit
    override fun div(unit: SI<*>): SI<*> = unit.inverse
    override infix fun pow(exponent: Int) = this
    override val inverse = this
}
