fun rangeBitCount(a: Int, b: Int): Int {
    val decimalArray: MutableList<Int> = mutableListOf()
    val binaryArray: MutableList<String> = mutableListOf()
    val resultArray: MutableList<Int> = mutableListOf()
    var result = 0
    for (i in a..b) {
        decimalArray.add(i - a, i)
    }
    for (i in 0 until decimalArray.size) {
        binaryArray.add(i, decimalArray[i].toString(2))
    }
    for (i in 0 until binaryArray.size) {
        resultArray.add(i, binaryArray[i].replace("0", "").length)
    }
    for (i in 0 until resultArray.size) {
        result += resultArray[i]
    }
    return result
}