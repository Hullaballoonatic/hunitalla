@file:Suppress("UNCHECKED_CAST", "LeakingThis", "MemberVisibilityCanBePrivate")

package hunitalla

import hunitalla.Unit.*
import hunitalla.helpers.attributes.Named
import hunitalla.helpers.functions.string.insertSpaces
import java.util.Collections.unmodifiableSet
import kotlin.reflect.KClass
import kotlin.reflect.KFunction1

abstract class UnitSystem(name: String? = null) : MutableMap<Dimension, MutableSet<Unit<*>>> by HashMap(), Named {
    override val name = name ?: javaClass.simpleName.insertSpaces()

    init {
        Systems += this
    }

    private val _units: MutableSet<Unit<*>> = hashSetOf()

    val units: Set<Unit<*>> get() = unmodifiableSet(_units)

    private val byQuantityType: MutableMap<KClass<out Quantity<*>>, Unit<*>> = HashMap()

    operator fun <Q : Quantity<Q>> get(quantityType: KClass<Q>): Unit<Q>? = byQuantityType[quantityType] as Unit<Q>?

    operator fun <Q : Quantity<Q>> plusAssign(unit: Unit<Q>) {
        add(unit)
    }

    operator fun <Q : Quantity<Q>> get(string: String): Unit<Q> = _units.first { string == it.toString() } as Unit<Q>

    object Systems : MutableList<UnitSystem> by arrayListOf() {
        operator fun get(name: String) = first { it.name == name }
    }

    fun <Q : Quantity<Q>> add(unit: Unit<Q>) = unit.also {
        _units.add(it)
        this[it.dimension]?.add(it) ?: put(it.dimension, hashSetOf(it))
        if (it is BaseUnit<Q>)
            if (byQuantityType[it.quantityType] == null) byQuantityType[it.quantityType] = unit
            else error("There already exists a base unit for this quantity type.")
    }

    fun <Q : Quantity<Q>> add(
        name: String,
        symbol: String,
        quantifier: KFunction1<Double, Quantity<Q>>,
        baseValueOf: (Double) -> Double
    ): Unit<Q> =
        add(object : Unit<Q> {
            override val name: String = name
            override val symbol: String = symbol
            override val quantifier = quantifier
            override val baseValueOf: (Double) -> Double = baseValueOf
            override val dimension: Dimension by lazy { quantityRef.dimension }
            override val quantityRef: Quantity<Q> by lazy { quantifier(0.0) }
            override val quantityType: KClass<out Quantity<Q>> by lazy { quantityRef::class }

            override val inverse: BaseUnit<*> by lazy { dimension.pow(-1).baseUnit }
        })

    fun <Q : Quantity<Q>> add(name: String, symbol: String, conversion: Scalar<Q>) =
        add(name, symbol, conversion.unit.quantifier) { conversion.value * it }

    fun <Q : Quantity<Q>> add(name: String, symbol: String, conversion: Shifter<Q>) =
        add(name, symbol, conversion.unit.quantifier) { conversion.value + it }

    fun <Q : Quantity<Q>> add(name: String, symbol: String, quantifier: KFunction1<Double, Quantity<Q>>): Unit<Q> =
        add(BaseUnit(name, symbol, quantifier))
}
