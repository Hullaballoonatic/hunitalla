package hunitalla

import hunitalla.helpers.functions.string.insertSpaces
import kotlin.reflect.KFunction1

open class SIUnit<Q: Quantity<Q>>(
    name: String? = null,
    override val symbol: String,
    override val quantifier: KFunction1<Double, Quantity<Q>>
) : Unit<Q> {
    constructor(symbol: String, quantifier: KFunction1<Double, Quantity<Q>>) : this(null, symbol, quantifier)

    override val name: String = name ?: javaClass.simpleName.insertSpaces()

    override val siUnit: SIUnit<Q> get() = this
}

