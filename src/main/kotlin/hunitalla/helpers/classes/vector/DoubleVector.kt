package hunitalla.helpers.classes.vector

import kotlin.math.sqrt

class DoubleVector(override val data: Array<Double>) : Vector<Double> {
    constructor(values: DoubleArray) : this(values.toTypedArray())
    constructor(size: Int, op: (index: Int) -> Double) : this(Array(size, op))

    override val size: Int = data.size

    override fun times(other: Vector<Double>): Double =
        if (isCompatible(other)) zip(other) { a, b -> a * b }.sum() else error("Incompatible Vectors.")

    override fun times(scalar: Double): Vector<Double> = DoubleVector(size) { this[it] * scalar }
    @JvmName("timesNumber")
    operator fun times(scalar: Number): Vector<Double> = times(scalar.toDouble())
    override fun div(divisor: Double): Vector<Double> = DoubleVector(size) { this[it] / divisor }
    @JvmName("divNumber")
    operator fun div(divisor: Number): Vector<Double> = div(divisor.toDouble())

    override fun plus(other: Vector<Double>): Vector<Double> =
        if (isCompatible(other)) DoubleVector(size) { this[it] + other[it] } else error("Incompatible Vectors.")

    override val negation by lazy { DoubleVector(size) { -this[it] } }

    override val sqMagnitude: Double by lazy { sumByDouble { it * it } }
    override val magnitude: Double by lazy { sqrt(sqMagnitude) }
    override val sum: Double by lazy { sum() }
    override val mean: Double by lazy { sum / size.toDouble() }
    override val mode: Double by lazy { groupingBy { it }.eachCount().maxBy { it.value }?.key!! }
    override val max: Double by lazy { max()!! }
    override val min: Double by lazy { min()!! }

    override fun hashCode(): Int = data.hashCode()

    override fun equals(other: Any?): Boolean = when(other) {
        null -> false
        is DoubleArray -> other.contentEquals(data.toDoubleArray())
        is Vector<*> -> data.contentEquals(other.data)
        else -> false
    }

    companion object {
        fun of(vararg values: Double) = DoubleVector(values.toTypedArray())
        fun of(vararg values: Number) = DoubleVector(Array(values.size) { values[it].toDouble() })
    }
}
