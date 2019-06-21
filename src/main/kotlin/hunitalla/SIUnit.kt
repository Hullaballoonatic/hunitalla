@file:Suppress("MemberVisibilityCanBePrivate")

package hunitalla

import hunitalla.helpers.functions.string.insertSpaces
import kotlin.reflect.KFunction1

open class SIUnit<Q: Quantity<Q>>(
    name: String? = null,
    override val symbol: String,
    override val quantifier: KFunction1<Double, Quantity<Q>>
) : Unit<Q> {
    constructor(symbol: String, quantifier: KFunction1<Double, Quantity<Q>>) : this(null, symbol, quantifier)

    private val quantityRef by lazy { quantifier(0.0) }

    val dimension by lazy { quantityRef.dimension }
    val quantityType by lazy { quantityRef::class }

    open operator fun times(unit: SIUnit<*>): SIUnit<*> = dimension.times(unit.dimension).si
    open operator fun div(unit: SIUnit<*>): SIUnit<*> = dimension.div(unit.dimension).si
    open infix fun pow(exponent: Int): SIUnit<*> = dimension.pow(exponent).si

    override val name: String = name ?: javaClass.simpleName.insertSpaces()

    override val toSIConversionFactor: Double = 1.0

    open val inverse: SIUnit<*> = dimension.pow(-1).si
}

