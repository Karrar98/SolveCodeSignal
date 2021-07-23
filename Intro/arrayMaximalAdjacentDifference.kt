fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>): Int {
    var maxSub : Int = 0
    for (i in 0 until inputArray.size-1){
        var result = inputArray[i] - inputArray[i+1]
        if (result <= 0){
            result = result * -1
        }
        maxSub = maxOf(maxSub, result)
    }
    return maxSub
}
