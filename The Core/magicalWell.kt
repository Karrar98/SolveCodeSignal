fun magicalWell(a: Int, b: Int, n: Int): Int {
    var sum = 0
    var x = a
    var y = b
    for (i in 1..n){
        sum += x * y
        x++
        y++
    }
    return sum
}
