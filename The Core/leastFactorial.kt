fun leastFactorial(n: Int): Int {
    var k = 1
    var i = 2
    while (k<n){
        k *= i
        i += 1
    }
    return k
}
