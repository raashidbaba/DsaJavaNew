package arrays

fun main(){
    val mat = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )

    val ans = spiralTraverse(mat)
    println(ans.joinToString(" "))
}



fun spiralTraverse(mat: Array<IntArray>):List<Int>{
    val ans = mutableListOf<Int>()
    val n = mat.size           // Number of rows
    val m = mat[0].size

    var top = 0
    var left = 0
    var bottom = n - 1
    var right = m - 1

    while (top <= bottom && left <= right) {

        // Move left to right
        for (i in left..right) {
            ans.add(mat[top][i])
        }
        top++

        // Move top to bottom
        for (i in top..bottom) {
            ans.add(mat[i][right])
        }
        right--

        // Move right to left
        if (top <= bottom) {
            for (i in right downTo left) {
                ans.add(mat[bottom][i])
            }
            bottom--
        }

        // Move bottom to top
        if (left <= right) {
            for (i in bottom downTo top) {
                ans.add(mat[i][left])
            }
            left++
        }
    }

    return ans









}