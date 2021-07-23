fun addTwoDigits(n: Int): Int {
    var sum = 0
    var m = n
    while (m != 0) {
        sum = sum + m % 10
        m = m / 10
    }
    return sum
}
