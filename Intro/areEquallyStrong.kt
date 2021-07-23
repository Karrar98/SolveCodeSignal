fun areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean {
    return ( yourLeft == friendsLeft && yourRight == friendsRight ) ||
            ( yourLeft == friendsRight && yourRight == friendsLeft )
}
