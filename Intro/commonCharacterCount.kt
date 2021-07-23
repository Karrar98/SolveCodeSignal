fun commonCharacterCount(s1: String, s2: String): Int {
    var count : Int = 0
    var t : MutableList<Boolean> = MutableList(s2.length, {false})
    for(i in 0..s1.length-1) {
        for (j in 0..s2.length-1) {
            if (s1[i] == s2[j] && !t[j]) {
                t[j] = true;
                count++;
                break;
            }
        }
    }
    return count;
}
