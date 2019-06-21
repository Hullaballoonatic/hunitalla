@file:Suppress("NonAsciiCharacters", "PropertyName", "unused", "MemberVisibilityCanBePrivate")

package hunitalla

import hunitalla.Unit.SI
import hunitalla.helpers.classes.vector.IntVector
import hunitalla.helpers.classes.vector.Vector
import hunitalla.helpers.classes.vector.toVector
import hunitalla.helpers.functions.integer.toSuperscript

open class Dimension(exponents: Vector<Int>) : Vector<Int> by exponents {
    constructor(arr: IntArray) : this(arr.toVector())
    constructor(L: Int = 0, M: Int = 0, T: Int = 0, I: Int = 0, Θ: Int = 0, N: Int = 0, J: Int = 0) :
            this(IntVector.of(L, M, T, I, Θ, N, J))

    val si: SI<*> by lazy { SIUnitsByDimension[this] ?: error("No such unit exists for this Dimension.") }

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

    companion object {
        val SIUnitsByDimension: MutableMap<Dimension, SI<*>> =
            TODO("Add every si unit into here...? Find a way to get object declarations to automatically add themselves into here?") // 1:1
    }
}
