package hunitalla.conversion

import hunitalla.Quantity
import hunitalla.Unit
import kotlin.reflect.KFunction1

open class ShiftedUnit<Q : Quantity<Q>>(
    name: String? = null,
    symbol: String,
    quantifier: KFunction1<Double, Quantity<Q>>,
    shift: Double
) : Unit<Q>(name, symbol, quantifier, { it + shift }) {
    constructor(symbol: String, quantifier: KFunction1<Double, Quantity<Q>>, shift: Double) :
            this(null, symbol, quantifier, shift)

    constructor(name: String?, symbol: String, shifter: Shifter<Q>) :
            this(name, symbol, shifter.unit.quantifier, shifter.value)

    constructor(symbol: String, shifter: Shifter<Q>) : this(null, symbol, shifter.unit.quantifier, shifter.value)
}
