package BinarySearch

fun main(){
    val arr = intArrayOf(2, 5, 6, 0, 0, 1, 2)
    val target = 8
    val result = rotatedSortedArrDuplicates(arr, target)
    println(result)
}


//contains duplicates
fun rotatedSortedArrDuplicates(arr:IntArray,target: Int): Boolean {
    var low = 0
    var high = arr.size-1

    while (low <= high){
        val mid = (low+high)/2

        if (arr[mid]==target){
            return true
        }

        //left sorted
        if (arr[low]==arr[mid] && arr[mid]==arr[high]){
            low++
            high--

        }else if (arr[low]<= arr[mid]){
                if (arr[low]<=target && target <= arr[mid]){
                    high = mid-1
                }else{
                    low = mid+1
                }

        }

        //right sorted
       else {
            if (arr[mid]<=target && target <= arr[high]){
                low = mid+1
            }else{
                high = mid-1
            }

        }


    }

return false




}