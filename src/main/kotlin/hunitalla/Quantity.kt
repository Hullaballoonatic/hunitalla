@file:Suppress("NonAsciiCharacters")

package hunitalla

import hunitalla.helpers.attributes.Named
import hunitalla.helpers.attributes.Valuable
import hunitalla.helpers.functions.string.insertSpaces

abstract class Quantity<Q : Quantity<Q>>(name: String?, val unit: SIUnit<Q>, val dimension: Dimension) : Named,
    Valuable<Double> {
    constructor(unit: SIUnit<Q>, dimension: Dimension) : this(null, unit, dimension)
    constructor(unit: SIUnit<Q>, L: Int = 0, M: Int = 0, T: Int = 0, I: Int = 0, Θ: Int = 0, N: Int = 0, J: Int = 0) :
            this(unit, Dimension(L, M, T, I, Θ, N, J))
    constructor(name: String, unit: SIUnit<Q>,
                L: Int = 0, M: Int = 0, T: Int = 0, I: Int = 0, Θ: Int = 0, N: Int = 0, J: Int = 0) :
            this(name, unit, Dimension(L, M, T, I, Θ, N, J))

    override val name: String = name ?: javaClass.simpleName.insertSpaces()

    operator fun plus(other: Quantity<Q>): Quantity<Q> = of(value + other.value)
    operator fun minus(other: Quantity<Q>): Quantity<Q> = this + -other
    operator fun unaryMinus(): Quantity<Q> = of(-value)

    private fun of(value: Double): Quantity<Q> = unit(value)
}
