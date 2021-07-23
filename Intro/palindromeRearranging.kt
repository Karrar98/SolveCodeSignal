fun palindromeRearranging(inputString: String): Boolean {
    // Create a list
    var list =  ArrayList<Char>();

    // For each character in input strings,
    // remove character if list contains
    // else add character to list
    for (i in 0 until inputString.length)
    {
        if (list.contains(inputString[i]))
            list.remove(inputString[i]);
        else
            list.add(inputString[i]);
    }

    // if string length is even
    return (inputString.length % 2 == 0
            && list.isEmpty()
            || (inputString.length % 2 == 1
            && list.size == 1));
}
