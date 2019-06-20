package hunitalla.helpers.attributes

interface Valuable<C: Comparable<C>> : Comparable<Valuable<C>> {
    val value: C

    override fun compareTo(other: Valuable<C>) = value.compareTo(other.value)
    fun compareTo(other: C) = value.compareTo(other)
}
