package binarySearch

fun main(){
    val nums = intArrayOf(5, 7, 7, 8, 8, 10)
    val target = 11
    val res = firstAndLastPos(nums, target)
    println(res.joinToString())
}


fun firstAndLastPos(nums: IntArray,target: Int):IntArray{
    val  first = firstOccurence(nums,target)
    if (first==-1){
        return intArrayOf(-1,-1)
    }
    val last = lastOccurence(nums, target)
    return intArrayOf(first,last)
}



fun firstOccurence(nums:IntArray,target: Int):Int{
    var low = 0
    var high = nums.size-1
    var first = -1
    while(low<=high){
        val mid = (low+high)/2

        if(nums[mid]==target){
            first = mid
            high = mid-1

        }else if(nums[mid]<target){
            low = mid +1

        }else{
            high = mid -1
        }

    }
    return first
}



fun lastOccurence(nums:IntArray,target: Int):Int{
    var low = 0
    var high = nums.size-1
    var last = -1
    while(low<=high){
        val mid = (low+high)/2

        if(nums[mid]==target){
            last = mid
            low = mid+1

        }else if(nums[mid]<target){
            low = mid +1

        }else{
            high = mid -1
        }

    }
    return last
}