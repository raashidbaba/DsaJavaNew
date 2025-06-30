package arrays

fun main(){
    val arr = intArrayOf(2,1,5,4,3,0,0)
    print(nextPermutation(arr).joinToString())

}



fun nextPermutation(array: IntArray): IntArray {
    var ind = -1

    // Step 1: Find the first decreasing element from the end
    for (i in array.size - 2 downTo 0) {
        if (array[i] < array[i + 1]) {
            ind = i
            break
        }
    }

    // Step 2: If no such element found, reverse the array
    if (ind == -1) {
        reverseArrayElements(array, 0, array.size - 1)
        return array
    }

    // Step 3: Find just larger element than array[ind] from the end
    for (i in array.size - 1 downTo 0) {
        if (array[i] > array[ind]) {
            swapElements(array, i, ind)
            break
        }
    }

    // Step 4: Reverse the rest of the array after ind
    reverseArrayElements(array, ind + 1, array.size - 1)
    return array
}

fun reverseArrayElements(arr: IntArray, start: Int, end: Int) {
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

fun swapElements(arr: IntArray, first: Int, second: Int) {
    val temp = arr[first]
    arr[first] = arr[second]
    arr[second] = temp
}