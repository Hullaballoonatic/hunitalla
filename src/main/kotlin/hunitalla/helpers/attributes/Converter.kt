package hunitalla.helpers.attributes

interface Converter<F, T> {
    val forward: (from: F) -> T
    val reverse: (from: T) -> F
}
