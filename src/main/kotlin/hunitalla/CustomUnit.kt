package hunitalla

import hunitalla.helpers.functions.string.insertSpaces
import kotlin.reflect.KFunction1

open class CustomUnit<Q: Quantity<Q>>(
    name: String? = null,
    override val symbol: String,
    override val siUnit: SIUnit<Q>,
    override val quantifier: KFunction1<Double, Quantity<Q>>
) : Unit<Q> {
    constructor(symbol: String, siUnit: SIUnit<Q>, quantifier: KFunction1<Double, Quantity<Q>>) :
            this(null, symbol, siUnit, quantifier)

    override val name: String = name ?: javaClass.simpleName.insertSpaces()
}
