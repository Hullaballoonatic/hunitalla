package hunitalla.prefixes

operator fun Number.times(scalar: ScalarPrefix) = scalar * this
operator fun Double.times(scalar: ScalarPrefix) = scalar * this
