package arrays

fun main(){
    val arr = intArrayOf(16, 17, 4, 3, 5, 2)
    val leaders = leaderInArr(arr)
    println(leaders)
}


fun leaderInArr(array: IntArray):ArrayList<Int>{
    var max = Int.MIN_VALUE
    val ansArray = ArrayList<Int>()

    for (i in array.size-1 downTo 0){
        if (array[i]>max){
            ansArray.add(array[i])
        }
        max = maxOf(max,array[i])
    }

    ansArray.reverse()
    return ansArray

}