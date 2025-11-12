package blind75

fun main(){

    val nums = intArrayOf(3,4,5,6)
    val target = 7
    val result = twoSum(nums,target)
    print(result.contentToString())

}

//brute force sol
//TC -> 0(n*n)

fun twoSum(arr:IntArray,target:Int): Array<Int> {

    for (i in 0..arr.size){

        for (j in i+1..arr.size){


            if (arr[i]+arr[j]==target){

                return arrayOf(i,j)

            }

        }
    }
    return arrayOf(0,0)
}





//optimal sol
fun optimalTwoSum(arr: IntArray,target: Int):IntArray{
    val map = mutableMapOf<Int, Int>()

    for (i in arr.indices){

        val first = arr[i]
        val more = target - first

        if (map.containsKey(more)){
            return intArrayOf(map[more]!!,i)

        }
        map.put(arr[i],i)



    }



 return intArrayOf(-1,-1)

}