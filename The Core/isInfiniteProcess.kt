fun isInfiniteProcess(a: Int, b: Int): Boolean {
    if (b<a)
        return true
    return (b-a)%2 != 0
}
