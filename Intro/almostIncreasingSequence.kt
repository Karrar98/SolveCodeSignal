fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
    var count : Int = 0
    for(i in 1 until sequence.size){
        if(sequence[i] <= sequence[i-1]){
            count++
        }
    }
    return count <=1
}
