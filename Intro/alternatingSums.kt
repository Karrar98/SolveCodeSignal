fun alternatingSums(a: MutableList<Int>): MutableList<Int> {
    var sumWeightsTeam1 : Int = 0
    var sumWeightsTeam2 : Int = 0
    for (i in 0 until a.size){
        if (i%2==0){
            sumWeightsTeam1 +=a[i]
        } else {
            sumWeightsTeam2 +=a[i]
        }
    }
    return mutableListOf(sumWeightsTeam1, sumWeightsTeam2)
}
