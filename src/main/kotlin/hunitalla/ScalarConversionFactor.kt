package hunitalla

data class ScalarConversionFactor<Q: Quantity<Q>>(val factor: Double, val unit: Unit<Q>) {
    operator fun div(divisor: Number) = div(divisor.toDouble())
    operator fun div(divisor: Double) = ScalarConversionFactor(factor / divisor, unit)
    operator fun times(scalar: Number) = times(scalar.toDouble())
    operator fun times(scalar: Double) = ScalarConversionFactor(factor * scalar, unit)
}

operator fun <Q: Quantity<Q>> Double.times(unit: SIUnit<Q>) = ScalarConversionFactor(this, unit)
operator fun <Q: Quantity<Q>> Number.times(unit: SIUnit<Q>) = ScalarConversionFactor(toDouble(), unit)
operator fun <Q: Quantity<Q>> Double.times(unit: Unit<Q>) = ScalarConversionFactor(this * unit.toSIConversionFactor, unit)
operator fun <Q: Quantity<Q>> Number.times(unit: Unit<Q>) = ScalarConversionFactor(toDouble() * unit.toSIConversionFactor, unit)
operator fun <Q: Quantity<Q>> SIUnit<Q>.div(factor: Double) = ScalarConversionFactor(1 / factor, this)
operator fun <Q: Quantity<Q>> SIUnit<Q>.div(factor: Number) = ScalarConversionFactor(1 / factor.toDouble(), this)
operator fun <Q: Quantity<Q>> Unit<Q>.div(factor: Double) = ScalarConversionFactor(1 / factor, this)
operator fun <Q: Quantity<Q>> Unit<Q>.div(factor: Number) = ScalarConversionFactor(1 / factor.toDouble(), this)
operator fun <Q: Quantity<Q>> Number.div(factor: ScalarConversionFactor<Q>) = factor * (1 / toDouble())
operator fun <Q: Quantity<Q>> Double.div(factor: ScalarConversionFactor<Q>) = factor * (1 / this)
operator fun <Q: Quantity<Q>> Number.times(factor: ScalarConversionFactor<Q>) = factor * this
operator fun <Q: Quantity<Q>> Double.times(factor: ScalarConversionFactor<Q>) = factor * this
