package hunitalla

import hunitalla.helpers.attributes.Named
import hunitalla.helpers.attributes.Symbolic
import hunitalla.helpers.functions.string.insertSpaces
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KFunction1

abstract class Unit(name: String? = null, override val symbol: String, val quantities: List<KFunction1<Double, Quantity<*>>>) : Named,
    Symbolic {
    constructor(symbol: String, vararg quantities: KFunction1<Double, Quantity<*>>) : this(null, symbol, quantities.toList())
    override val name: String = name ?: javaClass.simpleName.insertSpaces()

    val byQuantityType: Map<KClass<Quantity<*>>, KFunction1<Double, Quantity<*>>> = quantities.map { it::returnType.get() to it }.toMap()

    open val Double.toSIValue get() = this

    inline operator fun <reified Q: Quantity<Q>, reified K: KFunction1<Double, Quantity<Q>>> invoke(value: Double): Quantity<Q> {
        val constructor = byQuantityType[Q::class] as K
        return constructor(value.toSIValue)
    }
}
