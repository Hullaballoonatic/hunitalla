@file:Suppress("NonAsciiCharacters", "PropertyName", "unused", "MemberVisibilityCanBePrivate")

package hunitalla

import hunitalla.helpers.classes.vector.IntVector
import hunitalla.helpers.classes.vector.Vector
import hunitalla.helpers.functions.integer.toSuperscript

open class Dimension(
    L: Int = 0,
    M: Int = 0,
    T: Int = 0,
    I: Int = 0,
    Θ: Int = 0,
    N: Int = 0,
    J: Int = 0
) : Vector<Int> by IntVector(L, M, T, I, Θ, N, J) {
    constructor(arr: IntArray) : this(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6])
    constructor(v: Vector<Int>) : this(v[0], v[1], v[2], v[3], v[4], v[5], v[6])

    val L get() = get(0)
    val M get() = get(1)
    val T get() = get(2)
    val I get() = get(3)
    val Θ get() = get(4)
    val N get() = get(5)
    val J get() = get(6)

    val si: SIUnit<*> by lazy { SIUnitsByDimension[this] ?: error("No such unit exists for this Dimension.") }

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

    operator fun times(other: Dimension): Dimension = (this + other) as Dimension

    operator fun div(other: Dimension) = (this - other) as Dimension

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
        val SIUnitsByDimension: MutableMap<Dimension, SIUnit<*>> = TODO("Add every si unit into here...? Find a way to get object declarations to automatically add themselves into here?") // 1:1
    }
}
