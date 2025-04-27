package Arrays

fun main(){
    val arr = intArrayOf(1,2,3,4,5)
//    rotateArrayByOnePlace(arr)
//    print(arr.joinToString())

//    rotateByDPlaces(arr,3)
    rotateByDPlacesOptimal(arr,3)
    print(arr.joinToString())

}



fun rotateArrayByOnePlace(array: IntArray){
    val temp = array[0]
    for (i in 1..array.size-1){
        array[i-1] = array[i]
    }
    array[array.size-1] = temp

}




//brute-force approach
val temp = ArrayList<Int>()
fun rotateByDPlaces(arr:IntArray,d:Int){

    //store d elements in our new array
    for (i in 0..d){
        temp.add(arr[i])
    }

    //shift the rest elements to front
    for (i in d..arr.size-1){
        arr[i-d] = arr[i]
    }

    //put back the elements at the end
//    var j = 0
//    for (i in arr.size-d..arr.size-1){
//
//        arr[i] = temp[j]
//        j++
//
//    }

    for (i in arr.size-d..arr.size-1){
        arr[i] = temp[i-(arr.size-d)]
    }
}



fun rotateByDPlacesOptimal(arr:IntArray,d: Int){
    val n = arr.size
    if (n == 0 || d % n == 0) return   // handle edge cases

    val noOfRotations = d % n


    reverseArray(arr,0,noOfRotations-1)
        reverseArray(arr,noOfRotations,arr.size-1)
        reverseArray(arr,0,arr.size-1)
}


fun reverseArray(arr: IntArray, start: Int, end: Int) {
    var i = start
    var j = end

    while (i < j) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp

        i++
        j--
    }
}



