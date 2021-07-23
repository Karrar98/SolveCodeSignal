fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {

    var ids =  ArrayList<Int>();
    for (i in 0 until a.size) {
        if ( a[i] != b[i] ) {
            ids.add(i)
        }
    }
    if (ids.size == 0) {
        return true
    }
    if (ids.size != 2) {
        return false
    }
    var id1 = ids.get(0)
    var id2 = ids.get(1)
    if (a[id1] == b[id2] && a[id2] == b[id1]) {
        return true;
    }
    return false;
}
