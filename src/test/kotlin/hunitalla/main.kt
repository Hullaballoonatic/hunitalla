package hunitalla

import hunitalla.prefixes.si.c
import hunitalla.quantities.Mass
import hunitalla.quantities.derived.coherent.Density
import hunitalla.quantities.derived.coherent.Volume
import hunitalla.units.si.*
import org.junit.Test

object GeneralTesting {

    @Test
    fun foo() {
        val mass: Quantity<Mass> = 11.kg
        val volume: Quantity<Volume> = 1.m * 50.mm * 12.c.m
        val density: Quantity<Density> = mass / volume

        val acceleration = 5.km / s
    }

}
