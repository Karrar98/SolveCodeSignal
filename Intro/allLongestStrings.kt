fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    var longestStrings : MutableList<String> = mutableListOf()
    var maxLen : Int = 0
    for( i in 0 until inputArray.size){
        maxLen = maxOf(maxLen, inputArray[i].length)
    }
    for( i in 0 until inputArray.size){
        if(inputArray[i].length == maxLen){
            longestStrings.add(inputArray[i])
        }
    }
    return longestStrings
}
