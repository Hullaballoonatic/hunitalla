@file:Suppress("unused", "ObjectPropertyName", "NonAsciiCharacters")

package hunitalla.units.si.derived

val Number.celsius get() = DegreeCelsius(this)
val Double.celsius get() = DegreeCelsius(this)
val Number.centigrade get() = DegreeCelsius(this)
val Double.centigrade get() = DegreeCelsius(this)

val Number.rad get() = rad(this)
val Double.rad get() = rad(this)
val Number.radian get() = rad(this)
val Double.radian get() = rad(this)

val Number.sr get() = sr(this)
val Double.sr get() = sr(this)
val Number.steradian get() = sr(this)
val Double.steradian get() = sr(this)

val Number.Hz get() = Hz(this)
val Double.Hz get() = Hz(this)
val Number.hertz get() = Hz(this)
val Double.hertz get() = Hz(this)

val Number.N get() = N(this)
val Double.N get() = N(this)
val Number.newton get() = N(this)
val Double.newton get() = N(this)

val Number.Pa get() = Pa(this)
val Double.Pa get() = Pa(this)
val Number.pascal get() = Pa(this)
val Double.pascal get() = Pa(this)

val Number.J get() = J(this)
val Double.J get() = J(this)
val Number.joule get() = J(this)
val Double.joule get() = J(this)

val Number.W get() = W(this)
val Double.W get() = W(this)
val Number.watt get() = W(this)
val Double.watt get() = W(this)

val Number.C get() = C(this)
val Double.C get() = C(this)
val Number.coulomb get() = C(this)
val Double.coulomb get() = C(this)

val Number.V get() = V(this)
val Double.V get() = V(this)
val Number.volt get() = V(this)
val Double.volt get() = V(this)

val Number.F get() = F(this)
val Double.F get() = F(this)
val Number.farad get() = F(this)
val Double.farad get() = F(this)

val Number.Ω get() = Ω(this)
val Double.Ω get() = Ω(this)
val Number.ohm get() = Ω(this)
val Double.ohm get() = Ω(this)

val Number.S get() = S(this)
val Double.S get() = S(this)
val Number.siemens get() = S(this)
val Double.siemens get() = S(this)

val Number.Wb get() = Wb(this)
val Double.Wb get() = Wb(this)
val Number.weber get() = Wb(this)
val Double.weber get() = Wb(this)

val Number.T get() = T(this)
val Double.T get() = T(this)
val Number.tesla get() = T(this)
val Double.tesla get() = T(this)

val Number.H get() = H(this)
val Double.H get() = H(this)
val Number.henry get() = H(this)
val Double.henry get() = H(this)

val Number.lm get() = lm(this)
val Double.lm get() = lm(this)
val Number.lumen get() = lm(this)
val Double.lumen get() = lm(this)

val Number.lx get() = lx(this)
val Double.lx get() = lx(this)
val Number.lux get() = lx(this)
val Double.lux get() = lx(this)

val Number.Bq get() = Bq(this)
val Double.Bq get() = Bq(this)
val Number.becquerel get() = Bq(this)
val Double.becquerel get() = Bq(this)

val Number.Gy get() = Gy(this)
val Double.Gy get() = Gy(this)
val Number.gray get() = Gy(this)
val Double.gray get() = Gy(this)

val Number.Sv get() = Sv(this)
val Double.Sv get() = Sv(this)
val Number.sievert get() = Sv(this)
val Double.sievert get() = Sv(this)

val Number.kat get() = kat(this)
val Double.kat get() = kat(this)
val Number.katal get() = kat(this)
val Double.katal get() = kat(this)
