fun maxMultiple(divisor: Int, bound: Int): Int {
    var n = bound % divisor
    return bound-n
}
