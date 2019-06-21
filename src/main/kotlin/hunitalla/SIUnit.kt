@file:Suppress("MemberVisibilityCanBePrivate")

package hunitalla

import kotlin.reflect.KFunction1

open class SIUnit<Q : Quantity<Q>>(name: String? = null, symbol: String, quantifier: KFunction1<Double, Quantity<Q>>) :
    Unit<Q>(name, symbol, quantifier, { it }) {
    constructor(symbol: String, quantifier: KFunction1<Double, Quantity<Q>>) : this(null, symbol, quantifier)
}

