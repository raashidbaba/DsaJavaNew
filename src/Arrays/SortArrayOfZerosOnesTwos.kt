package Arrays

fun main(){
    val arr = intArrayOf(0,1,1,0,1,2,2,0,0,0)
    print(sortArray(arr))
}

//dutch national flag algorithm.
fun sortArray(nums:IntArray){
    val low = 0
    var mid =0
    var high = nums.size-1

    while (mid<=high){
        if (nums[mid]==0){
            swap(nums,low,mid)
        }
        else if(nums[mid]==1){
            mid++
        }
        else{
            swap(nums,mid,high)
            high--
        }
    }
}


fun swap(arr:IntArray,first:Int,last:Int){
    var temp = arr[first]
    arr[first] = arr[last]
    arr[last] = temp
}