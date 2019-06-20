@file:Suppress("NonAsciiCharacters", "PropertyName")

package hunitalla

import hunitalla.helpers.functions.integer.toSuperscript

open class Dimension(
    val L: Int = 0,
    val M: Int = 0,
    val T: Int = 0,
    val I: Int = 0,
    val Θ: Int = 0,
    val N: Int = 0,
    val J: Int = 0
) {
    constructor(arr: IntArray) : this(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6])

    val arr = intArrayOf(L, M, T, I, Θ, N, J)

    val IntArray.L get() = get(0)
    val IntArray.M get() = get(1)
    val IntArray.T get() = get(2)
    val IntArray.I get() = get(3)
    val IntArray.Θ get() = get(4)
    val IntArray.N get() = get(5)
    val IntArray.J get() = get(6)

    val si: Unit get() {

    }

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

    operator fun times(other: Dimension) = Dimension(
        L + other.L,
        M + other.M,
        T + other.T,
        I + other.I,
        Θ + other.Θ,
        N + other.N,
        J + other.J
    )

    operator fun div(other: Dimension) = Dimension(
        L - other.L,
        M - other.M,
        T - other.T,
        I - other.I,
        Θ - other.Θ,
        N - other.N,
        J - other.J
    )

    infix fun root(n: Int) = Dimension(L / n, M / n, T / n, I / n, Θ / n, N / n, J / n)

    infix fun pow(n: Int) = Dimension(L * n, M * n, T * n, I * n, Θ * n, N * n, J * n)

    override fun hashCode() = 73 * arr.hashCode()

    override fun equals(other: Any?) = when (other) {
        null -> false
        this -> true
        is Dimension -> other.arr.contentEquals(arr)
        else -> false
    }

    override fun toString(): String = arr.withIndex().joinToString("") { (i, it) ->
        when (it) {
            0 -> ""
            1 -> i.baseStr
            else -> i.baseStr + it.toSuperscript()
        }
    }
}

val dimensionsToSI
