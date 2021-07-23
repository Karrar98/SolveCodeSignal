fun metroCard(lastNumberOfDays: Int): MutableList<Int> {
    if (lastNumberOfDays==30 || lastNumberOfDays==28)
        return mutableListOf(31)
    if (lastNumberOfDays==31)
        return mutableListOf(28, 30, 31)
    return mutableListOf(31)
}
