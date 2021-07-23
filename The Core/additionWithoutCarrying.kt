fun additionWithoutCarrying(param1: Int, param2: Int): Int {
    var temp = 0
    var power = 0
    var num1 = param1
    var num2 = param2
    while (num1 != 0 || num2 != 0){
        temp += ((num1+num2)%10) * Math.pow(10.toDouble(), power.toDouble()).toInt()
        num1 /= 10
        num2 /= 10
        power += 1
    }

    return temp
}
