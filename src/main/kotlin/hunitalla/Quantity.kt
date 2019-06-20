@file:Suppress("NonAsciiCharacters")

package hunitalla

import hunitalla.helpers.attributes.Named
import hunitalla.helpers.attributes.Valuable
import hunitalla.helpers.functions.string.insertSpaces

abstract class Quantity<Q : Quantity<Q>>(name: String?, val si: Unit, val dimension: Dimension) : Named,
    Valuable<Double> {
    constructor(si: Unit, dimension: Dimension) : this(null, si, dimension)
    constructor(si: Unit, L: Int = 0, M: Int = 0, T: Int = 0, I: Int = 0, Θ: Int = 0, N: Int = 0, J: Int = 0) : this(
        si,
        Dimension(L, M, T, I, Θ, N, J)
    )
    constructor(
        name: String,
        si: Unit,
        L: Int = 0,
        M: Int = 0,
        T: Int = 0,
        I: Int = 0,
        Θ: Int = 0,
        N: Int = 0,
        J: Int = 0
    ) : this(name, si, Dimension(L, M, T, I, Θ, N, J))

    override val name: String = name ?: javaClass.simpleName.insertSpaces()

    operator fun plus(other: Quantity<Q>): Quantity<Q> = of(value + other.value)
    operator fun minus(other: Quantity<Q>): Quantity<Q> = this + -other
    operator fun unaryMinus(): Quantity<Q> = of(-value)

    private fun <Q : Quantity<Q>> of(value: Double): Quantity<Q> = si(value)
}
