package Arrays

fun main(){
val arr = intArrayOf(1,1,2,1,1,1,1,3,3,1)

    print(consecutiveOnes(arr))

}


fun consecutiveOnes(arr:IntArray):Int{
    var max = 0
    var count = 0
    for (i in arr.indices){
        if (arr[i]==1){
            count++
            max = maxOf(max,count)
        }else{
            count = 0
        }
    }
    return max
}