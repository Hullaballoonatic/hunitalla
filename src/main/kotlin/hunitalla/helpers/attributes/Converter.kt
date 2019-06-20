package hunitalla.helpers.attributes

interface Converter<F, T> {
    fun convert(from: F): T
}
