package arrays

fun main(){
    val arr = intArrayOf(7,1,5,3,6,4)
    print(buyAndSell(arr))

}




fun buyAndSell(nums:IntArray):Int{
    var l = 0
    var r = 0
    var maxProfit = 0

    while (r< nums.size){
        if (nums[l]< nums[r]){

            val profit = nums[r]-nums[l]
            maxProfit = maxOf(maxProfit,profit)
        }else{
            l = r
        }
        r++

    }
    return maxProfit
}