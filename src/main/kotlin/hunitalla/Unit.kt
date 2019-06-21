package hunitalla

import hunitalla.helpers.attributes.Named
import hunitalla.helpers.attributes.Symbolic
import hunitalla.helpers.attributes.Valuable
import hunitalla.helpers.functions.string.insertSpaces
import kotlin.reflect.KFunction1

sealed class Unit<Q : Quantity<Q>>(
    name: String? = null,
    override val symbol: String,
    val quantifier: KFunction1<Double, Quantity<Q>>,
    val siValueOf: (Double) -> Double
) : Named, Symbolic {
    constructor(symbol: String, quantifier: KFunction1<Double, Quantity<Q>>, siValueOf: (Double) -> Double) : this(
        null,
        symbol,
        quantifier,
        siValueOf
    )

    override val name: String = name ?: javaClass.simpleName.insertSpaces()

    operator fun invoke(value: Double) = quantifier(value)
    operator fun invoke(value: Number) = invoke(value.toDouble())

    private val quantityRef by lazy { quantifier(0.0) }

    val dimension by lazy { quantityRef.dimension }
    val quantityType by lazy { quantityRef::class }

    open operator fun times(unit: SI<*>): SI<*> = dimension.times(unit.dimension).si
    open operator fun div(unit: SI<*>): SI<*> = dimension.div(unit.dimension).si
    open infix fun pow(exponent: Int): SI<*> = dimension.pow(exponent).si

    open val inverse: SI<*> by lazy { dimension.pow(-1).si }

    object UnrecognizedCombinationError : Error("Unrecognized combination of units.")

    open class SI<Q : Quantity<Q>>(name: String? = null, symbol: String, quantifier: KFunction1<Double, Quantity<Q>>) :
        Unit<Q>(name, symbol, quantifier, { it }) {
        constructor(symbol: String, quantifier: KFunction1<Double, Quantity<Q>>) : this(null, symbol, quantifier)
    }

    open class Shifted<Q : Quantity<Q>>(
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

        class Shifter<Q : Quantity<Q>> private constructor(override val value: Double, val unit: Unit<Q>) :
            Valuable<Double> {
            companion object {
                operator fun <Q : Quantity<Q>> invoke(shift: Double, si: SI<Q>) = Shifter(shift, si)
                operator fun <Q : Quantity<Q>> invoke(shift: Number, si: SI<Q>) = Shifter(shift.toDouble(), si)
                operator fun <Q : Quantity<Q>> invoke(shift: Double, unit: Unit<Q>) =
                    Shifter(unit.siValueOf(shift), unit)

                operator fun <Q : Quantity<Q>> invoke(shift: Number, unit: Unit<Q>) =
                    Shifter(unit.siValueOf(shift.toDouble()), unit)
            }

            operator fun plus(shift: Double) = Shifter(this.value + shift, unit)
            operator fun plus(shift: Number) = plus(shift.toDouble())
            operator fun minus(shift: Double) = Shifter(this.value - shift, unit)
            operator fun minus(shift: Number) = minus(shift.toDouble())
            operator fun unaryMinus() = negation

            val negation: Shifter<Q> by lazy { Shifter(-value, unit) }
        }
    }

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

        class ConversionFactor<Q : Quantity<Q>> private constructor(override val value: Double, val unit: Unit<Q>) :
            Valuable<Double> {
            companion object {
                operator fun <Q : Quantity<Q>> invoke(factor: Double, si: SI<Q>) = ConversionFactor(factor, si)
                operator fun <Q : Quantity<Q>> invoke(factor: Number, si: SI<Q>) =
                    ConversionFactor(factor.toDouble(), si)

                operator fun <Q : Quantity<Q>> invoke(factor: Double, unit: Unit<Q>) =
                    ConversionFactor(unit.siValueOf(factor), unit)

                operator fun <Q : Quantity<Q>> invoke(factor: Number, unit: Unit<Q>) =
                    ConversionFactor(unit.siValueOf(factor.toDouble()), unit)
            }

            operator fun div(divisor: Number) = div(divisor.toDouble())
            operator fun div(divisor: Double) = ConversionFactor(value / divisor, unit)
            operator fun times(scalar: Number) = times(scalar.toDouble())
            operator fun times(scalar: Double) = ConversionFactor(value * scalar, unit)
        }
    }
}
