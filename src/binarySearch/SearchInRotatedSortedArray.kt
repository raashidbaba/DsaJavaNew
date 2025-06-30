package binarySearch

fun main(){
    val arr = intArrayOf(4, 5, 6, 7, 0, 1, 2)
    val target = 0
    val result = rotatedSortedArr(arr, target)
    println(result)
}



fun rotatedSortedArr(arr:IntArray,target: Int): Int {
    var low = 0
    var high = arr.size-1

    while (low <= high){
        val mid = (low+high)/2

        if (arr[mid]==target){
            return mid
        }

        //left sorted
        if (arr[low]<= arr[mid]){
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

return -1




}