fun shapeArea(n: Int): Int {
    return (n*n) + (n-1)*(n-1)
}

fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    var index : Int = 0
    var temp : Int
    var reng : Int
    for (i in 0 until statues.size){
        for (j in 0 until statues.size){
            if(statues[i]< statues[j]){
                temp = statues[i]
                statues[i]=statues[j]
                statues[j]=temp
            }
        }
    }
    reng = statues[statues.size-1]- statues[0]
    for(j in 1..reng){
        if(!(statues.contains(statues[0] + j)))
            index+=1
    }
    return index
}
