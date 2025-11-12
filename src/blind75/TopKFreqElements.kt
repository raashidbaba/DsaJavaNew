package blind75

fun main(){
    val arr = intArrayOf(1,2,2,3,3,3,3,3)
    val k = 2
    val sol = optimisedTopKFreq(arr,k)
    print(sol.contentToString())

}


//brute force approach
//TC: 0(nlogn)
//SC :0(n)
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        //step 1: print element with their occurrence
        val count = HashMap<Int, Int>()
        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }
        print(count)
        //{1=1, 2=2, 3=3}

        //step 2: add elements as pairs in list
        val arr = mutableListOf<Pair<Int, Int>>()
        for ((num, freq) in count) {
            arr.add(Pair(freq, num))
        }
        arr.sortByDescending { it.first }
        print(arr)


        //step 3: print k elements
        val res = IntArray(k)
        for (i in 0 until k) {
            res[i] = arr[i].second
        }
        return res
    }



//bucket sort algo
//TC:0(n)
fun optimisedTopKFreq(arr:IntArray,k:Int):IntArray{
    //add elements in hashmap
    val countMap = HashMap<Int,Int>()
    for (arr1 in arr){
        countMap[arr1] = countMap.getOrDefault(arr1,0)+1
    }

    //add elements -> with frequency and elements
    val bucket = Array(arr.size+1){ mutableListOf<Int>() }
    for ((number,freq) in countMap){
        bucket[freq].add(number)

    }

    //add top k elements in list
    //also how many times an element occurs
    val result = mutableListOf<Int>()
    for (i in bucket.size-1 downTo 0){

        for (nums in bucket[i]){

            result.add(nums)

            if (result.size ==k ) return  result.toIntArray()
        }
    }

    return result.toIntArray()
}
