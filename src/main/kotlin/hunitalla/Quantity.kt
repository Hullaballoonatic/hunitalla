@file:Suppress("NonAsciiCharacters")

package hunitalla

import hunitalla.helpers.attributes.Named
import hunitalla.helpers.attributes.Valuable
import hunitalla.helpers.functions.string.insertSpaces

abstract class Quantity<Q : Quantity<Q>>(value: Double, name: String?, val unit: Unit<Q>, val dimension: Dimension) : Named, Valuable<Double> {
    constructor(value: Double, unit: Unit<Q>, dimension: Dimension) : this(value, null, unit, dimension)
    constructor(value: Double, unit: Unit<Q>, L: Int = 0, M: Int = 0, T: Int = 0, I: Int = 0, Θ: Int = 0, N: Int = 0, J: Int = 0) :
            this(value, unit, Dimension(L, M, T, I, Θ, N, J))
    constructor(value: Double, name: String, unit: Unit<Q>,
                L: Int = 0, M: Int = 0, T: Int = 0, I: Int = 0, Θ: Int = 0, N: Int = 0, J: Int = 0) :
            this(value, name, unit, Dimension(L, M, T, I, Θ, N, J))

    override val value = unit.siValueOf(value)

    override val name: String = name ?: javaClass.simpleName.insertSpaces()

    operator fun plus(other: Quantity<Q>) = of(value + other.value)
    operator fun minus(other: Quantity<Q>) = of(value - other.value)
    operator fun unaryMinus(): Quantity<Q> = of(-value)

    operator fun times(scalar: Number) = times(scalar.toDouble())
    operator fun times(scalar: Double) = of(value * scalar)

    operator fun times(unit: Unit<*>): Quantity<*> = (dimension * unit).si(value)
    operator fun div(unit: Unit<*>): Quantity<*> = (dimension / unit).si(value)

    operator fun div(divisor: Number) = div(divisor.toDouble())
    operator fun div(divisor: Double) = of(value / divisor)

    operator fun times(other: Quantity<*>): Quantity<*> = (dimension * other).si(value * other.value)

    operator fun div(other: Quantity<*>): Quantity<*> = (dimension / other).si(value / (other.value))

    infix fun pow(exponent: Int) = (dimension pow exponent).si(value)
    infix fun root(base: Int) = (dimension root base).si(value)

    private fun of(value: Double) = unit(value)
}
