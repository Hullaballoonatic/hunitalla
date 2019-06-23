@file:Suppress("ObjectPropertyName", "unused", "NonAsciiCharacters")

package hunitalla.units.si

import hunitalla.Unit
import hunitalla.Unit.BaseUnit
import hunitalla.UnitSystem
import hunitalla.helpers.extensions.conversion.div
import hunitalla.helpers.extensions.conversion.plus
import hunitalla.helpers.extensions.conversion.times
import hunitalla.quantities.*
import hunitalla.quantities.derived.*
import hunitalla.quantities.derived.coherent.*
import hunitalla.quantities.derived.special.*
import kotlin.math.PI

object SI : UnitSystem("International System of Units") {
    // The 7 Base Units
    val m = add(Metre)

    object Metre : BaseUnit<Length>("m", ::Length) {
        override operator fun div(unit: Unit<*>): Unit<*> = when (unit) {
            Metre -> rad
            else -> super.div(unit)
        }
    }

    val kg = add(Kilogram)

    object Kilogram : BaseUnit<Mass>("g", ::Mass)

    val K = add(Kelvin)

    object Kelvin : BaseUnit<Temperature>("K", ::Temperature)

    val s = add(Second)

    object Second : BaseUnit<Time>("s", ::Time)

    val A = add(Ampere)

    object Ampere : BaseUnit<ElectricCurrent>("A", ::ElectricCurrent)

    val mol = add(Mole)

    object Mole : BaseUnit<AmountOfSubstance>("mol", ::AmountOfSubstance)

    val cd = add(Candela)

    object Candela : BaseUnit<LuminousIntensity>("cd", ::LuminousIntensity)

    // Absorbed Dose
    val Gy = add(Gray)

    object Gray : BaseUnit<AbsorbedDose>("Gy", ::AbsorbedDose)

    // Absorbed Dose Rate
    object GrayPerSecond : Unit<AbsorbedDoseRate> by add("Gray per Second", "Gy/s", ::AbsorbedDoseRate)

    // Acceleration
    object MetrePerSecondSquared : Unit<Acceleration> by add("Metre per Second Squared", "m/s²", ::Acceleration)

    // Angle
    val rad = add(Radian)

    object Radian : BaseUnit<PlaneAngle>("rad", ::PlaneAngle)
    object Degree : Unit<PlaneAngle> by add("Degree", "°", PI * rad / 180)

    val sr = add(Steradian)

    object Steradian : BaseUnit<SolidAngle>("sr", ::SolidAngle)

    object AngleMinute : Unit<PlaneAngle> by add("Minute", "\'", Degree / 60)
    object AngleSecond : Unit<PlaneAngle> by add("Second", "\"", AngleMinute / 60)

    // Angular Acceleration
    object RadianPerSecondSquared :
        Unit<AngularAcceleration> by add("Radian per Second Squared", "rad/s²", ::AngularAcceleration)

    // Angular Velocity
    object RadianPerSecond : Unit<AngularVelocity> by add("Radian per Second", "rad/s", ::AngularVelocity)

    // Area
    object SquareMetre : BaseUnit<Area>("m²", ::Area) {
        override operator fun div(unit: Unit<*>): Unit<*> = when (unit) {
            SquareMetre -> sr
            else -> super.div(unit)
        }
    }

    object Hectare : Unit<Area> by add("Hectare", "ha", 1e4 * SquareMetre)

    // Capacitance
    val F = add(Farad)

    object Farad : BaseUnit<Capacitance>("F", ::Capacitance)

    // Catalytic Activity
    val kat = add(Katal)

    object Katal : BaseUnit<CatalyticActivity>("kat", ::CatalyticActivity)

    // Catalytic Activity Concentration
    object KatalPerCubicMetre :
        Unit<CatalyticActivityConcentration> by add("Katal per Cubic Metre", "kat/m³", ::CatalyticActivityConcentration)

    // Concentration
    object MolePerCubicMetre : Unit<Concentration> by add("Mole per Cubic Metre", "mol/m³", ::Concentration)

    // Current Density
    object AmperePerSquareMetre : Unit<CurrentDensity> by add("Ampere per Square Metre", "A/m²", ::CurrentDensity)

    // Dynamic Viscosity
    object PascalSecond : Unit<DynamicViscosity> by add("Pascal Second", "Pa·s", ::DynamicViscosity)

    // Electric Charge
    val C = add(Coulomb)

    object Coulomb : BaseUnit<ElectricCharge>("C", ::ElectricCharge)

    // Electrical Charge Density
    object CoulombPerCubicMetre :
        Unit<ElectricChargeDensity> by add("Coulomb Per Cubic Metre", "C/m³", ::ElectricChargeDensity)

    // Electrical Conductance
    val S = add(Siemens)
        @JvmName("S") get() = field

    object Siemens : BaseUnit<ElectricalConductance>("S", ::ElectricalConductance)

    // Electric Field Strength
    object VoltPerMetre : Unit<ElectricFieldStrength> by add("Volt per Metre", "V/m", ::ElectricFieldStrength)

    // Energy
    val J = add(Joule)

    object Joule : BaseUnit<Energy>("J", ::Energy)
    object Electronvolt : Unit<Energy> by add("Electronvolt", "eV", 1.602176634e-19 * J)

    // Energy Density
    object JoulePerCubicMetre : Unit<EnergyDensity> by add("Joule per Cubic Metre", "J/m³", ::EnergyDensity)

    // Exposure
    object CoulombPerKilogram : Unit<Exposure> by add("Coulomb per Kilogram", "C/kg", ::Exposure)

    // Density
    object KilogramPerCubicMetre : Unit<Density> by add("Kilogram per Cubic Metre", "kg/m³", ::Density)

    // Equivalent Dose
    val Sv = add(Sievert)

    object Sievert : BaseUnit<EquivalentDose>("Sv", ::EquivalentDose)

    // Force
    val N = add(Newton)

    object Newton : BaseUnit<Force>("N", ::Force)

    // Frequency
    val Hz = add(Hertz)

    object Hertz : BaseUnit<Frequency>("Hz", ::Frequency)

    // Heat Capacity
    object JoulePerKelvin : Unit<HeatCapacity> by add("Joule per Kelvin", "J/K", ::HeatCapacity)

    // Heat Flux Density
    object WattPerSquareMetre : Unit<HeatFluxDensity> by add("Watt per Square Metre", "W/m²", ::HeatFluxDensity)

    // Illuminance
    val lx = add(Lux)

    object Lux : BaseUnit<Illuminance>("lx", ::Illuminance)

    // Inductance
    val H = add(Henry)

    object Henry : BaseUnit<Inductance>("H", ::Inductance)

    // Length
    object AstronomicalUnit : Unit<Length> by add("Astronomical Unit", "au", 149597870700 * m)

    object Kilometre : Unit<Length> by add("Kilometre", "km", 1e3 * m)
    object Millimetre : Unit<Length> by add("Millimetre", "mm", 1e-3 * m)

    // Luminance
    object CandelaPerSquareMetre : Unit<Luminance> by add("Candela per Square Metre", "cd/m²", ::Luminance)

    // Luminous Flux
    val lm = add(Lumen)

    object Lumen : BaseUnit<LuminousFlux>("lm", ::LuminousFlux)

    // Magnetic Field Strength
    object AmperePerMetre : Unit<MagneticFieldStrength> by add("Ampere per Metre", "A/m", ::MagneticFieldStrength)

    // Magnetic Flux
    val Wb = add(Weber)

    object Weber : BaseUnit<MagneticFlux>("Wb", ::MagneticFlux)

    // Magnetic Flux Density
    val T = add(Tesla)

    object Tesla : BaseUnit<MagneticFluxDensity>("T", ::MagneticFluxDensity)

    // Mass
    object Dalton : Unit<Mass> by add("Atomic Mass Unit (Dalton)", "Da", 1.66053906660e-27 * kg)

    object Gram : Unit<Mass> by add("Gram", "g", 1e-3 * kg)
    object Tonne : Unit<Mass> by add("Tonne (Metric ton)", "t", 1e3 * kg)

    // MolarEnergy
    object JoulePerMole : Unit<MolarEnergy> by add("Joule per Mole", "J/mol", ::MolarEnergy)

    // Molar Heat Capacity
    object JoulePerMoleKelvin :
        Unit<MolarHeatCapacity> by add("Joule per Mole Kelvin", "J/(mol·K)", ::MolarHeatCapacity)

    // Moment of Force
    object NewtonMetre : Unit<MomentOfForce> by add("Newton Metre", "N·m", ::MomentOfForce)

    // Permeability
    object HenryPerMetre : Unit<Permeability> by add("Henry per Metre", "H/m", ::Permeability)

    // Permittivity
    object FaradPerMetre : Unit<Permittivity> by add("Farad per Metre", "F/m", ::Permittivity)

    // Power
    val W = add(Watt)

    object Watt : BaseUnit<Power>("W", ::Power)

    // Pressure
    val Pa = add(Pascal)

    object Pascal : BaseUnit<Pressure>("Pa", ::Pressure)

    // Radiance
    object WattPerSquareMetreSteradian :
        Unit<Radiance> by add("Watt per Square Metre Steradian", "W/(m²·Sr)", ::Radiance)

    // Radiant Intensity
    object WattPerSteradian : Unit<RadiantIntensity> by add("Watt Per Steradian", "W/Sr", ::RadiantIntensity)

    // Radioactivity
    val Bq = add(Becquerel)

    object Becquerel : BaseUnit<Radioactivity>("Bq", ::Radioactivity)

    // Resistance
    val Ω = add(Ohm)

    object Ohm : BaseUnit<Resistance>("Ω", ::Resistance)

    // Specific Energy
    object JoulePerKilogram : Unit<SpecificEnergy> by add("Joule per Kilogram", "J/kg", ::SpecificEnergy)

    // Specific Heat Capacity
    object JoulePerKilogramKelvin :
        Unit<SpecificHeatCapacity> by add("Joule per Kilogram Kelvin", "J/(kg·K)", ::SpecificHeatCapacity)

    // Specific Volume
    object CubicMetrePerKilogram : Unit<SpecificVolume> by add("Cubic Metre per Kilogram", "m³/kg", ::SpecificVolume)

    // Surface Density
    object KilogramPerSquareMetre : Unit<SurfaceDensity> by add("Kilogram per Square Metre", "kg/m²", ::SurfaceDensity)

    // Surface Charge Density
    object CoulombPerSquareMetre :
        Unit<SurfaceChargeDensity> by add("Coulomb per Square Metre", "C/m²", ::SurfaceChargeDensity)

    // Surface Tension
    object NewtonPerMetre : Unit<SurfaceTension> by add("Newton Per Metre", "N/m", ::SurfaceTension)

    // Temperature
    object DegreeCelsius : Unit<Temperature> by add("DegreeCelsius", "°C", K + 273.15)

    // Thermal Conductivity
    object WattPerMetreKelvin :
        Unit<ThermalConductivity> by add("Watt per Metre Kelvin", "W/(m·K)", ::ThermalConductivity)

    // Time
    object Minute : Unit<Time> by add("Minute", "min", 60 * s)

    object Hour : Unit<Time> by add("Hour", "h", 60 * min)
    object Day : Unit<Time> by add("Day", "d", 24 * h)

    // Velocity
    object MetrePerSecond : Unit<Velocity> by add("Metre per Second", "m/s", ::Velocity)

    // Volume
    object CubicMetre : Unit<Volume> by add("Cubic Metre", "m³", ::Volume)

    object Litre : Unit<Volume> by add("Litre", "L", 1e-3 * CubicMetre)

    object Millilitre : Unit<Volume> by add("Millilitre", "mL", 1e-3 * L)

    // Voltage
    val V = add(Volt)

    object Volt : BaseUnit<Voltage>("V", ::Voltage)

    // Wavenumber
    object ReciprocalMetre : Unit<Wavenumber> by add("Reciprocal Metre", "m⁻¹", ::Wavenumber)
}
