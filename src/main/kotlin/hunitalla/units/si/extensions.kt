@file:Suppress("unused", "ObjectPropertyName", "NonAsciiCharacters")

package hunitalla.units.si

val Number.m get() = m(toDouble())
val Double.m get() = m(this)
val Number.metre get() = m(toDouble())
val Double.metre get() = m(this)

val Number.kg get() = kg(this)
val Double.kg get() = kg(this)
val Number.kilogram get() = kg(this)
val Double.kilogram get() = kg(this)

val Number.s get() = s(this)
val Double.s get() = s(this)
val Number.second get() = s(this)
val Double.second get() = s(this)
val Number.sec get() = s(this)
val Double.sec get() = s(this)

val Number.A get() = A(this)
val Double.A get() = A(this)
val Number.ampere get() = A(this)
val Double.ampere get() = A(this)

val Number.K get() = K(this)
val Double.K get() = K(this)
val Number.kelvin get() = K(this)
val Double.kelvin get() = K(this)

val Number.mol get() = mol(this)
val Double.mol get() = mol(this)
val Number.mole get() = mol(this)
val Double.mole get() = mol(this)

val Number.cd get() = cd(this)
val Double.cd get() = cd(this)
val Number.candela get() = cd(this)
val Double.candela get() = cd(this)

val Number.t get() = t(this)
val Double.t get() = t(this)
val Number.tonne get() = t(this)
val Double.tonne get() = t(this)

val Number.Da get() = Da(this)
val Double.Da get() = Da(this)
val Number.dalton get() = Da(this)
val Double.dalton get() = Da(this)

val Number.u get() = u(this)
val Double.u get() = u(this)
val Number.atomicMassUnit get() = u(this)
val Double.atomicMassUnit get() = u(this)

val Number.eV get() = eV(this)
val Double.eV get() = eV(this)
val Number.electronVolt get() = eV(this)
val Double.electronVolt get() = eV(this)

val Number.ha get() = ha(this)
val Double.ha get() = ha(this)
val Number.hectare get() = ha(this)
val Double.hectare get() = ha(this)

val Number.L get() = L(this)
val Double.L get() = L(this)
val Number.litre get() = L(this)
val Double.litre get() = L(this)

val Number.mL get() = mL(this)
val Double.mL get() = mL(this)
val Number.millilitre get() = mL(this)
val Double.millilitre get() = mL(this)

val Number.au get() = au(this)
val Double.au get() = au(this)
val Number.astronomicalUnit get() = au(this)
val Double.astronomicalUnit get() = au(this)

val Number.km get() = km(this)
val Double.km get() = km(this)
val Number.kilometre get() = km(this)
val Double.kilometre get() = km(this)

val Number.mm get() = mm(this)
val Double.mm get() = mm(this)
val Number.millimetre get() = mm(this)
val Double.millimetre get() = mm(this)

val Number.g get() = g(this)
val Double.g get() = g(this)
val Number.gram get() = g(this)
val Double.gram get() = g(this)

val Number.min get() = min(this)
val Double.min get() = min(this)
val Number.minute get() = min(this)
val Double.minute get() = min(this)

val Number.h
    @JvmName("h")
    get() = h(this)
val Double.h
    @JvmName("h")
    get() = h(this)
val Number.hr get() = h(this)
val Double.hr get() = h(this)
val Number.hour get() = h(this)
val Double.hour get() = h(this)

val Number.d get() = d(this)
val Double.d get() = d(this)
val Number.day get() = d(this)
val Double.day get() = d(this)

val Number.celsius get() = SI.DegreeCelsius.invoke(this)
val Double.celsius get() = SI.DegreeCelsius.invoke(this)
val Number.centigrade get() = SI.DegreeCelsius.invoke(this)
val Double.centigrade get() = SI.DegreeCelsius.invoke(this)

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

val Number.S
    @JvmName("NumberS") get() = S(this)
val Double.S
    @JvmName("DoubleS") get() = S(this)
val Number.siemens get() = S(this)
val Double.siemens get() = S(this)

val Number.Wb get() = Wb(this)
val Double.Wb get() = Wb(this)
val Number.weber get() = Wb(this)
val Double.weber get() = Wb(this)

val Number.T
    @JvmName("NumberT") get() = T(this)
val Double.T
    @JvmName("DoubleT") get() = T(this)
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
