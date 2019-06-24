@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package hunitalla.units.si

import hunitalla.Unit
import hunitalla.Unit.Base
import hunitalla.Unit.Converted
import hunitalla.UnitSystem
import hunitalla.conversion.div
import hunitalla.conversion.plus
import hunitalla.conversion.times
import hunitalla.quantities.*
import hunitalla.quantities.derived.*
import hunitalla.quantities.derived.coherent.*
import hunitalla.quantities.derived.special.*
import kotlin.math.PI

object SI : UnitSystem("International System invoke Units") {
    // The 7 Base Units
    val Metre = add(object : Base<Length>("m", ::Length) {
        override operator fun div(unit: Unit<*>) = when (unit) {
            this -> rad
            else -> super.div(unit)
        }
    })
    val Kilogram = add(Base("g", ::Mass))
    val Kelvin = add(Base("K", ::Temperature))
    val Second = add(Base("s", ::Time))
    val Ampere = add(Base("A", ::ElectricCurrent))
    val Mole = add(Base("mol", ::AmountOfSubstance))
    val Candela = add(Base("cd", ::LuminousIntensity))

    // Absorbed Dose
    val Gray = add(Base("Gy", ::AbsorbedDose))

    // Absorbed Dose Rate
    val GrayPerSecond = add(Base("Gy/s", ::AbsorbedDoseRate))

    // Acceleration
    val MetrePerSecondSquared = add(Base("m/s²", ::Acceleration))

    // Angle
    val Radian = add(Base("rad", ::PlaneAngle))
    val Degree = add(Converted("°", PI * rad / 180))
    val Steradian = add(Base("sr", ::SolidAngle))
    val AngleMinute = add(Converted("Minute", "\'", Degree / 60))
    val AngleSecond = add(Converted("Second", "\"", AngleMinute / 60))

    // Angular Acceleration
    val RadianPerSecondSquared = add(Base("rad/s²", ::AngularAcceleration))

    // Angular Velocity
    val RadianPerSecond = add(Base("rad/s", ::AngularVelocity))

    // Area
    val SquareMetre = add(object : Base<Area>("m²", ::Area) {
        override operator fun div(unit: Unit<*>) = when (unit) {
            this -> sr
            else -> super.div(unit)
        }
    })

    val Hectare = add(Converted("Hectare", "ha", 1e4 * SquareMetre))

    // Capacitance
    val Farad = add(Base("F", ::Capacitance))

    // Catalytic Activity
    val Katal = add(Base("kat", ::CatalyticActivity))

    // Catalytic Activity Concentration
    val KatalPerCubicMetre =
        add(Base("kat/m³", ::CatalyticActivityConcentration))

    // Concentration
    val MolePerCubicMetre = add(Base("mol/m³", ::Concentration))

    // Current Density
    val AmperePerSquareMetre = add(Base("A/m²", ::CurrentDensity))

    // Density
    val KilogramPerCubicMetre = add(Base("kg/m³", ::Density))

    // Dynamic Viscosity
    val PascalSecond = add(Base("Pa·s", ::DynamicViscosity))

    // Electric Charge
    val Coulomb = add(Base("C", ::ElectricCharge))

    // Electrical Charge Density
    val CoulombPerCubicMetre = add(Base("C/m³", ::ElectricChargeDensity))

    // Electrical Conductance
    val Siemens = add(Base("S", ::ElectricalConductance))

    // Electric Field Strength
    val VoltPerMetre = add(Base("V/m", ::ElectricFieldStrength))

    // Energy
    val Joule = add(Base("J", ::Energy))
    val Electronvolt = add(Converted("eV", 1.602176634e-19.J))

    // Energy Density
    val JoulePerCubicMetre = add(Base("J/m³", ::EnergyDensity))

    // Exposure
    val CoulombPerKilogram = add(Base("C/kg", ::Exposure))

    // Equivalent Dose
    val Sievert = add(Base("Sv", ::EquivalentDose))

    // Force
    val Newton = add(Base("N", ::Force))

    // Frequency
    val Hertz = add(Base("Hz", ::Frequency))

    // Heat Capacity
    val JoulePerKelvin = add(Base("J/K", ::HeatCapacity))

    // Heat Flux Density
    val WattPerSquareMetre = add(Base("W/m²", ::HeatFluxDensity))

    // Illuminance
    val Lux = add(Base("lx", ::Illuminance))

    // Inductance
    val Henry = add(Base("H", ::Inductance))

    // Length
    val AstronomicalUnit = add(Converted("au", 149597870700.m))
    val Kilometre = add(Converted("km", 1e3.m))
    val Millimetre = add(Converted("mm", 1e-3.m))

    // Luminance
    val CandelaPerSquareMetre = add(Base("cd/m²", ::Luminance))

    // Luminous Flux
    val Lumen = add(Base("lm", ::LuminousFlux))

    // Magnetic Field Strength
    val AmperePerMetre = add(Base("A/m", ::MagneticFieldStrength))

    // Magnetic Flux
    val Weber = add(Base("Wb", ::MagneticFlux))

    // Magnetic Flux Density
    val Tesla = add(Base("T", ::MagneticFluxDensity))

    // Mass
    val Dalton = add(Converted("Atomic Mass Unit (Dalton)", "Da", 1.66053906660e-27.kg))
    val Gram = add(Converted("g", 1e-3.kg))
    val Tonne = add(Converted("Tonne (Metric ton)", "t", 1e3.kg))

    // MolarEnergy
    val JoulePerMole = add(Base("J/mol", ::MolarEnergy))

    // Molar Heat Capacity
    val JoulePerMoleKelvin = add(Base("J/(mol·K)", ::MolarHeatCapacity))

    // Moment invoke Force
    val NewtonMetre = add(Base("N·m", ::MomentOfForce))

    // Permeability
    val HenryPerMetre = add(Base("H/m", ::Permeability))

    // Permittivity
    val FaradPerMetre = add(Base("F/m", ::Permittivity))

    // Power
    val Watt = add(Base("W", ::Power))

    // Pressure
    val Pascal = add(Base("Pa", ::Pressure))

    // Radiance
    val WattPerSquareMetreSteradian = add(Base("W/(m²·Sr)", ::Radiance))

    // Radiant Intensity
    val WattPerSteradian = add(Base("W/Sr", ::RadiantIntensity))

    // Radioactivity
    val Becquerel = add(Base("Bq", ::Radioactivity))

    // Resistance
    val Ohm = add(Base("Ω", ::Resistance))

    // Specific Energy
    val JoulePerKilogram = add(Base("J/kg", ::SpecificEnergy))

    // Specific Heat Capacity
    val JoulePerKilogramKelvin = add(Base("J/(kg·K)", ::SpecificHeatCapacity))

    // Specific Volume
    val CubicMetrePerKilogram = add(Base("m³/kg", ::SpecificVolume))

    // Surface Density
    val KilogramPerSquareMetre = add(Base("kg/m²", ::SurfaceDensity))

    // Surface Charge Density
    val CoulombPerSquareMetre = add(Base("C/m²", ::SurfaceChargeDensity))

    // Surface Tension
    val NewtonPerMetre = add(Base("N/m", ::SurfaceTension))

    // Temperature
    val DegreeCelsius = add(Converted("°C", K + 273.15))

    // Thermal Conductivity
    val WattPerMetreKelvin = add(Base("W/(m·K)", ::ThermalConductivity))

    // Time
    val Minute = add(Converted("min", 60.s))
    val Hour = add(Converted("h", 60.min))
    val Day = add(Converted("d", 24.hr))

    // Velocity
    val MetrePerSecond = add(Base("m/s", ::Velocity))

    // Volume
    val CubicMetre = add(Base("m³", ::Volume))
    val Litre = add(Converted("L", 1e-3 * CubicMetre))
    val Millilitre = add(Converted("mL", 1e-3.L))

    // Voltage
    val Volt = add(Base("V", ::Voltage))

    // Wavenumber
    val ReciprocalMetre = add(Base("m⁻¹", ::Wavenumber))
}
