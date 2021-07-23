fun countSumOfTwoRepresentations2(n: Int, l: Int, r: Int): Int {
    if (2 * r < n || 2 * l > n) return 0
    var min = maxOf(l, n - r);
    var max = minOf(r, n - l);
    var mid = (max + min) / 2
    return mid - min + 1
}
