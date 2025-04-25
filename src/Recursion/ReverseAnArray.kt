package Recursion



fun main() {
   val arr = intArrayOf(1,2,3,4,5)
    val n = 5
//    print(reverseAnArray(0,n-1,arr).toString())

     reverseAnArray(0, n-1, arr)
    print(arr.joinToString())
}


fun reverseAnArray(l:Int,r:Int,arr: IntArray){
    if (l>=r){
        return
    }
    swap(arr,l,r)
  return  reverseAnArray(l+1,r-1,arr)
}



fun reverseArray(array: Array<Int>,n:Int){



}



fun swap(arr: IntArray, first: Int, last: Int) {
    val temp = arr[first]
    arr[first] = arr[last]
    arr[last] = temp

}


/*fun reverseAnArray(start:Int,end:Int,arr: IntArray){
    for (i in 0..end){
        if (start>=end/2  ){
            return
        }
        swap(arr,arr[i],arr[end-i-1])
        reverseAnArray(start+1,end,arr)
    }

}*/