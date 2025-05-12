package Arrays

fun main(){
    val arr = intArrayOf(7,1,5,3,6,4)
    print(buyAndSell(arr))

}




fun buyAndSell(nums:IntArray):Int{
    var min = nums[0]
    var profit = 0

    for (i in 1 until nums.size){
        val cost = nums[i]-min
        profit = maxOf(profit,cost)
        min = minOf(min,nums[i])
    }

    return profit
}