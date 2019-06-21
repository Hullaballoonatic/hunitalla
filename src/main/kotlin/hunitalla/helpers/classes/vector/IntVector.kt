package hunitalla.helpers.classes.vector

import kotlin.math.sqrt

class IntVector(override val data: Array<Int>) : Vector<Int> {
    constructor(values: IntArray) : this(values.toTypedArray())
    constructor(size: Int, op: (index: Int) -> Int) : this(Array(size, op))

    override val size: Int = data.size

    override fun times(other: Vector<Int>): Int =
        if (isCompatible(other)) zip(other) { a, b -> a * b }.sum() else error("Incompatible Vectors.")

    override fun times(scalar: Int): Vector<Int> = IntVector(size) { this[it] * scalar }
    operator fun times(scalar: Double): Vector<Double> = DoubleVector(size) { this[it] * scalar }
    operator fun div(divisor: Int): Vector<Int> = IntVector(size) { this[it] / divisor }
    override fun div(divisor: Double): Vector<Double> = DoubleVector(size) { this[it] / divisor }

    override fun plus(other: Vector<Int>): Vector<Int> =
        if (isCompatible(other)) IntVector(size) { this[it] + other[it] } else error("Incompatible Vectors.")

    override val negation by lazy { IntVector(size) { -this[it] } }

    override val sqMagnitude: Double by lazy { sumByDouble { it * it.toDouble() } }
    override val magnitude: Double by lazy { sqrt(sqMagnitude) }
    override val sum: Int by lazy { sum() }
    override val mean: Double by lazy { sum / size.toDouble() }
    override val mode by lazy { groupingBy { it }.eachCount().maxBy { it.value }?.key!!}
    override val max: Int by lazy { max()!! }
    override val min: Int by lazy { min()!! }

    override fun hashCode() = data.hashCode()

    override fun equals(other: Any?) = when(other) {
        null -> false
        is IntArray -> other.contentEquals(data.toIntArray())
        is Vector<*> -> other.data.contentEquals(data)
        else -> false
    }

    companion object {
        fun of(vararg values: Int) = IntVector(values.toTypedArray())
    }
}
