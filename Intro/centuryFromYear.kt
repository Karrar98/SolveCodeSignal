fun centuryFromYear(year: Int): Int {
    var yearString : String = year.toString()
    return if (yearString[yearString.length-1] == '0' && yearString[yearString.length-2] == '0')
        year/100
    else
        (year/100)+1
}
