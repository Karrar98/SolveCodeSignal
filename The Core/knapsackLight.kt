fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    if (maxW < weight1 && maxW < weight2) return 0

    if (maxW >= weight1 + weight2) return value1 + value2

    if ((weight1 <= maxW) && ((value1 >= value2) || (weight2 > maxW))){
        return value1
    } else {
        return value2
    }

}
