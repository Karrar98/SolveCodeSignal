fun tennisSet(score1: Int, score2: Int): Boolean {
    var mini = minOf(score1, score2)
    var maxi = maxOf(score1, score2)

    if (maxi == 6 && mini < 5)
        return true
    else if (maxi == 7 && (mini == 5 || mini == 6))
        return true
    return false
}
