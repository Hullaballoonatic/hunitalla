@file:Suppress("UNCHECKED_CAST", "LeakingThis", "MemberVisibilityCanBePrivate")

package hunitalla

import hunitalla.Unit.Base
import hunitalla.UnitSystem.GetBy.NAME
import hunitalla.helpers.attributes.Named
import hunitalla.helpers.functions.string.insertSpaces
import java.util.Collections.unmodifiableSet
import kotlin.reflect.KClass

abstract class UnitSystem(name: String? = null) : MutableMap<Dimension, Base<*>> by HashMap(), Named {
    override val name = name ?: javaClass.simpleName.insertSpaces()

    init {
        Systems += this
    }

    private val _units: MutableSet<Unit<*>> = hashSetOf()

    val units: Set<Unit<*>> get() = unmodifiableSet(_units)

    private val byQuantityType: MutableMap<KClass<out Quantity<*>>, Base<*>> = HashMap()

    operator fun <Q : Quantity<Q>> get(quantityType: KClass<Q>): Unit<Q>? = byQuantityType[quantityType] as Unit<Q>?

    operator fun <Q : Quantity<Q>> plusAssign(unit: Unit<Q>) {
        add(unit)
    }

    operator fun <Q : Quantity<Q>> get(string: String, by: GetBy = NAME) =
        units.firstOrNull { string == it[by] } as Unit<Q>?

    enum class GetBy {
        NAME, SYMBOL, TO_STRING
    }

    object Systems : MutableList<UnitSystem> by arrayListOf() {
        operator fun get(name: String) = first { it.name == name }
    }

    fun <Q : Quantity<Q>> add(unit: Unit<Q>) = unit.also {
        _units.add(it)
        if (it is Base<Q>) {
            if (this[it.dimension] == null) put(it.dimension, it)
            else error("There already exists a base unit for the dimension: ${it.dimension}")
            byQuantityType[it.quantityType] = it
        }
    }
}
