fun arrayPacking(a: MutableList<Int>): Int {
    var sum = 0
    for (i in 0 until a.size){
        sum += a[a.size - i - 1] * (Math.pow(256.toDouble(), (a.size - i - 1).toDouble())).toInt()
    }
    return sum
}
