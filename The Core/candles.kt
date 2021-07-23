fun candles(candlesNumber: Int, makeNew: Int): Int {
    var total = 0
    var leftover=0
    var candles = candlesNumber
    while (candles != 0){
        total += candles
        leftover += candles
        candles = leftover/makeNew
        leftover -= candles*makeNew
    }

    return total
}
