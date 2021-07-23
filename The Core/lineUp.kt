fun lineUp(commands: String): Int {
    var deg = 0
    var temp = 0
    for (i in 0 until commands.length){
        when (commands[i]){
            'L' -> deg += -90
            'R' -> deg += 90
            'A' -> deg += 180
        }
        if (deg%180==0){
            temp += 1
            deg = 0
        }
    }

    return temp
}
