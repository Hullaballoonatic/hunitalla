package hunitalla.conversion

import hunitalla.Quantity
import hunitalla.Unit
import kotlin.reflect.KFunction1

open class ScaledUnit<Q : Quantity<Q>>(
    name: String? = null,
    symbol: String,
    quantifier: KFunction1<Double, Quantity<Q>>,
    toSIConversionFactor: Double
) : Unit<Q>(name, symbol, quantifier, { it * toSIConversionFactor }) {
    constructor(symbol: String, quantifier: KFunction1<Double, Quantity<Q>>, toSIConversionFactor: Double) :
            this(null, symbol, quantifier, toSIConversionFactor)

    constructor(name: String, symbol: String, unitFactor: ConversionFactor<Q>) :
            this(name, symbol, unitFactor.unit.quantifier, unitFactor.value)

    constructor(symbol: String, unitFactor: ConversionFactor<Q>) :
            this(null, symbol, unitFactor.unit.quantifier, unitFactor.value)
}


