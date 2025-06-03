package Arrays

fun main(){
    val arr = intArrayOf(100, 4, 200, 1, 3, 2)
    val result = longestSeq(arr)
    println(result)
}




fun longestSeq(array: IntArray):Int{
    var longest = 1

    val set = mutableSetOf<Int>()
    for (i in 0 until array.size){
        set.add(array[i])
    }
    for (iterateSet in set){
        if (!set.contains(iterateSet-1)){
            var cnt = 1
            var current = iterateSet

            while (set.contains(current + 1)) {
                current += 1
                cnt += 1
            }
            longest = maxOf(longest, cnt)
        }
    }


    return longest

}