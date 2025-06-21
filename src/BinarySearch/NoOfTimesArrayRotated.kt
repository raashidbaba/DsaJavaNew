package BinarySearch


fun main() {
    val nums = intArrayOf(5, 6, 7, 1, 2, 3, 4)
    val index = findNoOfTimesArrRotated(nums)
    println("Array is rotated $index times (minimum element at index $index)")
}





fun findNoOfTimesArrRotated(nums: IntArray): Int {
    var low = 0
    var high = nums.size-1
    var ans = Int.MAX_VALUE
    var index = -1

    while(low <= high){
        val mid = (low+high)/2

        if(nums[low]<=nums[high]){
            if (nums[low]< ans){
                index = low
                ans = nums[low]
            }
            break
        }

        if(nums[low]<= nums[mid]){
            if (nums[low]< ans){
                index = low
                ans = nums[low]
            }
            low = mid + 1




        }else{
            if (nums[mid]< ans){
                index = mid
                ans = nums[mid]
            }
            high = mid -1
        }




    }




    return index



}