package hunitalla.helpers.functions.string

fun String.insertSpaces(): String = replace(Regex("(.)([A-Z])")) {
    val (a, b) = it.groupValues
    "$a $b"
}
