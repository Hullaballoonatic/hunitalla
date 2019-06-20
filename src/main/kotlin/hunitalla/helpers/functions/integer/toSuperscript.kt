package hunitalla.helpers.functions.integer

fun Int.toSuperscript(): String = if (this < 0) "⁻" else "" + toDigitsArray().joinToString("") {
    when(it) {
        0 -> "⁰"
        1 -> "¹"
        2 -> "²"
        3 -> "³"
        4 -> "⁴"
        5 -> "⁵"
        6 -> "⁶"
        7 -> "⁷"
        8 -> "⁸"
        9 -> "⁹"
        else -> error("wat.")
    }
}
