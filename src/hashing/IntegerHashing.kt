package hashing


fun main() {
    val arr = intArrayOf(1, 3, 2, 1, 3)
    val queries = intArrayOf(1, 4, 2, 3, 12)
    val freq = IntArray(13)

    //pre-computation
    //hashing
    for (i in arr){
        freq[i]++
    }


    //fetching
    for (q in queries){
        val count = if (q in queries.indices){
            freq[q]
        }else{
            0
        }
        print("count ${count}")
    }








}


