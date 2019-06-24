@file:Suppress("NonAsciiCharacters", "PropertyName", "unused", "MemberVisibilityCanBePrivate", "UNCHECKED_CAST")

package hunitalla

import hunitalla.Unit.Base
import hunitalla.helpers.classes.vector.IntVector
import hunitalla.helpers.classes.vector.Vector
import hunitalla.helpers.functions.integer.toSuperscript

open class Dimension(exponents: Vector<Int>) : Vector<Int> by exponents {
    constructor(arr: IntArray) : this(IntVector(arr))
    constructor(L: Int = 0, M: Int = 0, T: Int = 0, I: Int = 0, Θ: Int = 0, N: Int = 0, J: Int = 0) :
            this(IntVector.of(L, M, T, I, Θ, N, J))

    val L get() = get(0)
    val M get() = get(1)
    val T get() = get(2)
    val I get() = get(3)
    val Θ get() = get(4)
    val N get() = get(5)
    val J get() = get(6)

    private val Int.baseStr
        get() = when (this) {
            0 -> "L"
            1 -> "M"
            2 -> "T"
            3 -> "I"
            4 -> "Θ"
            5 -> "N"
            6 -> "J"
            else -> error("wat.")
        }

    operator fun times(other: Dimension) = Dimension(this + other)
    operator fun times(other: Quantity<*>) = Dimension(this + other.dimension)
    operator fun times(other: Unit<*>) = Dimension(this + other.dimension)

    operator fun div(other: Dimension) = Dimension(this - other)
    operator fun div(other: Quantity<*>) = Dimension(this - other.dimension)
    operator fun div(other: Unit<*>) = Dimension(this - other.dimension)

    infix fun root(n: Int) = Dimension(L / n, M / n, T / n, I / n, Θ / n, N / n, J / n)

    infix fun pow(n: Int) = Dimension(L * n, M * n, T * n, I * n, Θ * n, N * n, J * n)

    override fun hashCode() = 73 * data.hashCode()

    override fun equals(other: Any?) = when (other) {
        null -> false
        this -> true
        is Dimension -> other.data.contentEquals(data)
        else -> false
    }

    override fun toString(): String = withIndex().joinToString("") { (i, it) ->
        when (it) {
            0 -> ""
            1 -> i.baseStr
            else -> i.baseStr + it.toSuperscript()
        }
    }

    operator fun get(unitSystem: UnitSystem): Base<*>? = unitSystem[this]
}
