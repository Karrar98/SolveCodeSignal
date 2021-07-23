fun lateRide(n: Int): Int {
    var sec = n%60
    var minu = (n-sec)/60
    var temp = 0
    while (sec !=0 ){
        temp += sec%10
        sec /= 10
    }

    while (minu !=0 ){
        temp += minu%10
        minu /=10
    }

    return temp
}