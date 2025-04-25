package Arrays

fun main(){
//        val arr = intArrayOf(1,1,2,2,2,3,3)
//        removeDuplicates(arr)
//    removeDuplicatesOptimal(arr)


    val arr = intArrayOf(1, 1, 2, 2, 3, 4, 4)

    print(removeDuplicatesOptimal(arr).joinToString())


}

//Brute-force approach
//T.C -> 0(nlogn)
fun removeDuplicates(arr:Array<Int>){
    val setOfNonDup = mutableSetOf<Int>()
    for (i in 0..arr.size-1){
        setOfNonDup.add(arr[i])

    }

}

//Optimal approach : using two pointers
//T.C -> 0(n)
fun removeDuplicatesOptimal(arr: IntArray): IntArray {


    var i = 0

    for (j in 1 until arr.size) {
        if (arr[j] != arr[i]) {
            i++
            arr[i] = arr[j]
        }
    }

    val result = IntArray(i + 1)
    for (k in 0..i) {
        result[k] = arr[k]
    }

    return IntArray(i+1)
}
