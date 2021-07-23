fun arithmeticExpression(a: Int, b: Int, c: Int): Boolean {
    if (a + b == c || a - b == c || a * b == c || (a % b == 0 && a / b == c)) return true
    return false
}
