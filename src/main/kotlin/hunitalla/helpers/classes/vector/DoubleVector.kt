package hunitalla.helpers.classes.vector

import kotlin.math.sqrt

class DoubleVector(override val data: Array<Double>) : Vector<Double> {
    constructor(size: Int, op: (index: Int) -> Double) : this(Array(size, op))
    constructor(vararg values: Double) : this(values.toTypedArray())
    constructor(vararg values: Number) : this(Array(values.size) { values[it].toDouble() })

    override val size: Int = data.size

    override fun times(other: Vector<Double>): Double = if (isCompatible(other)) zip(other) { a, b -> a * b }.sum() else error("Incompatible Vectors.")

    override fun plus(other: Vector<Double>): Vector<Double> = if (isCompatible(other)) DoubleVector(
        size
    ) { this[it] + other[it] } else error("Incompatible Vectors.")

    override val negation by lazy { DoubleVector(size) { -this[it] } }

    override val sqMagnitude: Double by lazy { sumByDouble { it * it } }
    override val magnitude: Double by lazy { sqrt(sqMagnitude) }
    override val sum: Double by lazy { sum() }
    override val mean: Double by lazy { sum / size.toDouble() }
    override val mode by lazy { groupingBy { it }.eachCount().maxBy { it.value }?.key!! }
    override val max: Double by lazy { max()!! }
    override val min: Double by lazy { min()!! }
}
