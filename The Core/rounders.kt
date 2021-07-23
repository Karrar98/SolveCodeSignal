import java.lang.Math.pow
import kotlin.math.pow

fun rounders(n: Int): Int {
    var digit = 1
    var m = n
    if (m < 10)
        return m
    if (m% 10.toDouble().pow(digit.toDouble()).toInt()>=5)
        m += 10.toDouble().pow(digit.toDouble()).toInt()
    m -= (m% 10.toDouble().pow(digit.toDouble()).toInt())
    digit += 1

    while (m> 10.toDouble().pow(digit.toDouble()).toInt()){
        if ((m% 10.toDouble().pow(digit.toDouble()).toInt()) >= 5* 10.toDouble().pow((digit - 1).toDouble()).toInt())
            m += 10.toDouble().pow(digit.toDouble()).toInt()
        if (m>= 10.toDouble().pow(digit.toDouble()).toInt())
            m -= (m% 10.toDouble().pow(digit.toDouble()).toInt())
        digit += 1
    }

    return m
}
