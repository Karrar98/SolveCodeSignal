fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    var sumCost : Int = 0
    for (i in 0 until matrix.size){
        for (j in 0 until matrix.get(0).size){
            if(i == 0 && matrix[i][j] != 0){
                sumCost += matrix[i][j]
            } else if (matrix[i][j] != 0){
                if(matrix[i-1][j] != 0){
                    sumCost += matrix[i][j]
                } else
                    matrix[i][j] = 0
            }
        }
    }
    return sumCost
}
