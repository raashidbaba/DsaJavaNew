package arrays

fun main() {
    val arr = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    rotateMatrixBy90(arr)

    println("Rotated Image")
    for (row in arr) {
        println(row.joinToString(" "))
    }
}

//brute-force approach
fun rotateMatrixBy90Brute(array: Array<IntArray>){
    val n = array.size
    val matrix = Array(n) { IntArray(n) }

    for (i in 0 until n){
        for (j in 0 until n){
            matrix[j][n-1-i] = array[i][j]
        }
    }


}



//optimal approach
fun rotateMatrixBy90(array: Array<IntArray>) {
    val n = array.size

    // Step 1: Transpose the matrix
    for (i in 0 until n) {
        for (j in i until n) {
            swap(array, i, j, j, i)
        }
    }

    // Step 2: Manually reverse each row (without built-in function)
    for (i in 0 until n) {
        var left = 0
        var right = n - 1
        while (left < right) {
            swap(array, i, left, i, right)
            left++
            right--
        }
    }
}



fun swap(matrix: Array<IntArray>, i1: Int, j1: Int, i2: Int, j2: Int) {
    val temp = matrix[i1][j1]
    matrix[i1][j1] = matrix[i2][j2]
    matrix[i2][j2] = temp
}