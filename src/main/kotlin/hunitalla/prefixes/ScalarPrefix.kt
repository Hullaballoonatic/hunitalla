package hunitalla.prefixes

import hunitalla.helpers.attributes.Prefix
import hunitalla.helpers.attributes.Valuable
import hunitalla.helpers.functions.string.insertSpaces

abstract class ScalarPrefix(name: String? = null, override val symbol: String, override val value: Double) : Prefix,
    Valuable<Double> {
    constructor(symbol: String, value: Double) : this(null, symbol, value)
    override val name = name ?: javaClass.simpleName.insertSpaces().toLowerCase()

    operator fun times(other: Double) = value * other
    operator fun times(other: Number) = value * other.toDouble()
}
