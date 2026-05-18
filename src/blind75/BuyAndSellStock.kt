package blind75








fun buyAndSellStock(nums:IntArray):Int{

    var l = 0
    var r = 1
    var maxP = 0

    while (r < nums.size){
        if (nums[l]< nums[r]){
            val profit = nums[r]-nums[l]
            maxP = maxOf(maxP,profit)


        }else{
            l = r
        }
        r++

    }
return maxP
}