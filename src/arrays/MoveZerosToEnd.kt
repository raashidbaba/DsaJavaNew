package arrays

fun main(){
    val arr = intArrayOf(0, 2, 0, 3, 4, 0, 1)
    zerosToEndOptimal(arr)
    println(arr.joinToString())

}

//brute-force approach
fun zerosToEnd(array: IntArray){
    //store non-zero no.s in a new list
    val temp = ArrayList<Int>()
    for (i in 0..array.size-1){
        if (array[i]!=0){
            temp.add(array[i])
        }
    }
    //add these non zeros elements to main list
    for (i in 0..temp.size-1){
        array[i] = temp[i]
    }
    val noOfNonZero = temp.size
    //add the zeros to array after non-zero items
    for (i in noOfNonZero..<array.size){
        array[i] = 0
    }
}

fun zerosToEndOptimal(arr:IntArray){
    var j = 0
    for (i in 0..arr.size-1){
        if (arr[i]==0){
            j = i
            break
        }
    }

    for (i in j+1..arr.size-1){
        if (arr[i]!=0){
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            j++
        }
    }
}










