package hunitalla

import hunitalla.helpers.attributes.Named
import hunitalla.helpers.attributes.Symbolic
import kotlin.reflect.KFunction1

interface Unit<Q: Quantity<Q>> : Named, Symbolic {
    val quantifier: KFunction1<Double, Quantity<Q>>

    val siUnit: SIUnit<Q>

    operator fun invoke(value: Double) = quantifier(value)
}
