@file:Suppress("MemberVisibilityCanBePrivate")

package hunitalla.conversion

import hunitalla.Quantity
import hunitalla.SIUnit
import hunitalla.Unit
import hunitalla.helpers.attributes.Valuable

class Shifter<Q: Quantity<Q>> private constructor(override val value: Double, val unit: Unit<Q>) : Valuable<Double> {
    companion object {
        operator fun <Q: Quantity<Q>> invoke(shift: Double, si: SIUnit<Q>) = Shifter(shift, si)
        operator fun <Q: Quantity<Q>> invoke(shift: Number, si: SIUnit<Q>) = Shifter(shift.toDouble(), si)
        operator fun <Q: Quantity<Q>> invoke(shift: Double, unit: Unit<Q>) = Shifter(unit.siValueOf(shift), unit)
        operator fun <Q: Quantity<Q>> invoke(shift: Number, unit: Unit<Q>) = Shifter(unit.siValueOf(shift.toDouble()), unit)
    }
    operator fun plus(shift: Double) = Shifter(this.value + shift, unit)
    operator fun plus(shift: Number) = plus(shift.toDouble())
    operator fun minus(shift: Double) = Shifter(this.value - shift, unit)
    operator fun minus(shift: Number) = minus(shift.toDouble())
    operator fun unaryMinus() = negation

    val negation: Shifter<Q> by lazy { Shifter(-value, unit) }
}
