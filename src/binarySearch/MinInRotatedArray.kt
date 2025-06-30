package binarySearch

fun main() {

    val nums = intArrayOf(4,5,6,7,0,1,2)
    println("Minimum element is: ${findMin(nums)}")
}







    fun findMin(nums: IntArray): Int {
        var low = 0
        var high = nums.size-1
        var ans = Int.MAX_VALUE

        while(low <= high){
            val mid = (low+high)/2

            if(nums[low]<=nums[high]){
                ans = minOf(ans,nums[low])
                break
            }

            if(nums[low]<= nums[mid]){
                ans = minOf(ans,nums[low])
                low = mid + 1




            }else{
                ans = minOf(ans,nums[mid])
                high = mid -1
            }




        }




        return ans



    }
