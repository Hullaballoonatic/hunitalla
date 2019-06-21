package hunitalla

import hunitalla.helpers.attributes.Named
import hunitalla.helpers.attributes.Symbolic
import hunitalla.helpers.functions.string.insertSpaces
import kotlin.reflect.KFunction1

abstract class Unit<Q: Quantity<Q>>(name: String? = null, override val symbol: String, val quantifier: KFunction1<Double, Quantity<Q>>, val siValueOf: (Double) -> Double) : Named, Symbolic {
    constructor(symbol: String, quantifier: KFunction1<Double, Quantity<Q>>, siValueOf: (Double) -> Double) : this(null, symbol, quantifier, siValueOf)

    override val name: String = name ?: javaClass.simpleName.insertSpaces()

    operator fun invoke(value: Double) = quantifier(value)
    operator fun invoke(value: Number) = invoke(value.toDouble())

    private val quantityRef by lazy { quantifier(0.0) }

    val dimension by lazy { quantityRef.dimension }
    val quantityType by lazy { quantityRef::class }

    open operator fun times(unit: SIUnit<*>): SIUnit<*> = dimension.times(unit.dimension).si
    open operator fun div(unit: SIUnit<*>): SIUnit<*> = dimension.div(unit.dimension).si
    open infix fun pow(exponent: Int): SIUnit<*> = dimension.pow(exponent).si

    val inverse: SIUnit<*> by lazy { dimension.pow(-1).si }
}
