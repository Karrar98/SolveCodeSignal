fun isLucky(n: Int): Boolean {
    var t = n.toString()
    var sum1 = 0
    var sum2 = 0
    for (i in 0..(t.length/2)-1){
        sum1 += t[i].toInt()
        sum2 += t[i+t.length/2].toInt()
    }
    return sum1 == sum2
}
