fun increaseNumberRoundness(n: Int): Boolean {
    var m = n
    var nonZeroFound = false
    var digit = 0
    while (m != 0) {
        digit = m % 10

        if (digit != 0) {
            nonZeroFound = true
        }

        if (nonZeroFound && digit == 0) {
            return true
        }

        m = (m-digit)/10
    }

    return false
}
