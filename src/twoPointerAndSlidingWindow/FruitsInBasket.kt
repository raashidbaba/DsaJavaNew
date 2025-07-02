package twoPointerAndSlidingWindow

fun main(){
    val arr = intArrayOf(3,3,3,1,2,1,1,2,3,3,4)
    val k = 2
    println(fruitsInBasket(arr, k))
}



fun fruitsInBasket(arr: IntArray,k:Int):Int{
    var left = 0
    var maxLen = 0
    var right = 0
    val map = mutableMapOf<Int,Int>()

    while (right < arr.size){

        map[arr[right]] = map.getOrDefault(arr[right], 0) + 1

        if (map.size>k){

            map[arr[left]] = map[arr[left]]!! - 1

            if (map[arr[left]]==0){
                map.remove(arr[left])
            }
            left++

        }
        if (map.size<=k){
            maxLen = maxOf(maxLen,right-left+1)

        }
        right++
    }
    return maxLen
}