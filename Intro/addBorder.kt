fun addBorder(picture: MutableList<String>): MutableList<String> {
    var startEnd = ""
    var listSize = picture.get(0).length + 2
    for (i in 0 until listSize){
        startEnd +="*"
    }
    var list = ArrayList<String>()
    list.add(startEnd);
    for(i in 0 until picture.size){
        list.add("*"+picture[i]+"*");
    }
    list.add(startEnd);
    return list.toMutableList()
}
