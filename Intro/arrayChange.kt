fun arrayChange(inputArray: MutableList<Int>): Int {
    var moves = 0
    var series = inputArray
    for (i in 1 until series.size) {
        if (series[i] <= series[i - 1]) {
            var diff = (series[i - 1] - series[i]) + 1;
            series[i] += diff;
            moves += diff;
        }
    }

    return moves;
}
