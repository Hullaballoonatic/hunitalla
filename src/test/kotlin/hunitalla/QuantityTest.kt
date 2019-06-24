package hunitalla

import hunitalla.units.si.SI
import org.junit.Test


internal class QuantityTest {

    @Test
    fun toString1() {
        val kilo = SI.Kilogram
        println(kilo)
    }
}
