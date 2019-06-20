package hunitalla.helpers.functions.integer

fun Int.toDigitsArray(): IntArray {
    val digits = arrayListOf<Int>()
    var num = this
    do {
        digits += num % 10
        num /= 10
    } while (num > 0)
    return digits.toIntArray()
}
