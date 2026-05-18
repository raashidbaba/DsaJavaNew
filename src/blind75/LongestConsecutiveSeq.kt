package blind75

fun main(){

    val arr = intArrayOf(100,4,200,1,3,2)
    val result = longestConsecutiveSeq(arr)
    println(result )


}


//convert array to set so that we can find if its previous is available or not


fun longestConsecutiveSeq(arr:IntArray):Int{
    val numSet = arr.toSet()
    var longest = 0

    for (nums in numSet){

        if ((nums-1) !in numSet){
            var length = 1

        while ((nums+length) in numSet){
            length++

        }

            longest = maxOf(longest,length)
        }
    }



return longest


}