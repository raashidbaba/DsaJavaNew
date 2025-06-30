package binarySearch

fun main(){
val arr = intArrayOf(1,1,2,2,3,3,4,5,5,6,6)
    val result = singleNonDuplicate(arr)
    print(result)
}




    fun singleNonDuplicate(nums: IntArray): Int {
        val n = nums.size

        if(n-1 == 1){
            return nums[0]
        }

        if(nums[0]!=nums[1]){
            return nums[0]
        }

        if(nums[n-1]!= nums[n-2]){
            return nums[n-1]
        }

        var low = 1
        var high = n-2

        while(low<=high){
            val mid = (low+high)/2

            if(nums[mid]!=nums[mid-1]&& nums[mid]!=nums[mid+1]){
                return nums[mid]
            }

            if(mid%2==0 && nums[mid-1]==nums[mid] || mid%2==1 && nums[mid+1]==nums[mid]){
                low = mid+1
            }else{
                high = mid -1
            }

        }
        return -1
    }

