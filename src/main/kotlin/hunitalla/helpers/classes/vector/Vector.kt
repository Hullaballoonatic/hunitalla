package hunitalla.helpers.classes.vector

interface Vector<N: Number> : Iterable<N> {
    val data: Array<N>
    override fun iterator(): Iterator<N> = data.iterator()

    val size: Int

    operator fun get(index: Int) = data[index]

    operator fun times(other: Vector<N>): N
    operator fun plus(other: Vector<N>): Vector<N>
    operator fun minus(other: Vector<N>): Vector<N> = plus(-other)
    operator fun unaryMinus(): Vector<N> = negation

    val negation: Vector<N>

    fun isCompatible(other: Vector<N>): Boolean = size == other.size

    val magnitude: Double
    val sqMagnitude: Double

    val sum: N
    val mean: Double
    val mode: N
    val max: N
    val min: N
}

