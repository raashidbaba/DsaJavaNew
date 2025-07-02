package twoPointerAndSlidingWindow

fun main(){
    val nums = intArrayOf(1,1,1,0,0,0,1,1,1,1,0)
    val k = 2
    println(consecutiveOnes(nums, k))
}




fun consecutiveOnes(nums:IntArray,k:Int):Int{

    var left = 0
    var zeroCount = 0
    var maxLen = 0

    for (right in nums.indices) {
        if (nums[right] == 0){
            zeroCount++
        }

        if (zeroCount > k) {
            if (nums[left] == 0){
                zeroCount--
            }
            left++
        }

        if (zeroCount<=k){
            maxLen = maxOf(maxLen,right-left+1)
            //increment is controlled by for loop
        }
    }

    return maxLen




}