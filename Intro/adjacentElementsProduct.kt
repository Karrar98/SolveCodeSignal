fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    var max : Int = 0
    val index : Int = 1
    var result : Int
    for (i in 0..inputArray.size-1){
        if (i==inputArray.size-1){
            break
        } else {
            result = inputArray[i] * inputArray[i+index]
            if(i==0)
                max = result
            if (max<result)
                max = result
        }
    }
    return max
}
