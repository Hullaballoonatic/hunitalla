package hunitalla

import hunitalla.helpers.functions.string.insertSpaces
import hunitalla.quantities.derived.PlaneAngle
import kotlin.math.PI
import kotlin.reflect.KFunction1

open class ScalarUnit<Q: Quantity<Q>>(name: String? = null, override val symbol: String,
                                 override val quantifier: KFunction1<Double, Quantity<Q>>,
                                 override val toSIConversionFactor: Double) : Unit<Q> {
    constructor(symbol: String, quantifier: KFunction1<Double, Quantity<Q>>, toSIConversionFactor: Double) : this(null, symbol, quantifier, toSIConversionFactor)
    constructor(name: String, symbol: String, unitFactor: ScalarConversionFactor<Q>) : this(name, symbol, unitFactor.unit.quantifier, unitFactor.factor)
    constructor(symbol: String, unitFactor: ScalarConversionFactor<Q>) : this(null, symbol, unitFactor.unit.quantifier, unitFactor.factor)

    override val name: String = name ?: javaClass.simpleName.insertSpaces()
}


