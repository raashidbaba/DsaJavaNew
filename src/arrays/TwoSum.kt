package arrays

fun main(){
val arr = intArrayOf(2,6,5,8,11)
    val target = 14
    print(twoSum(arr,target).joinToString())
}


fun twoSum(arr:IntArray,target:Int):IntArray{

    val hashMap = HashMap<Int,Int>()

    for (i in arr.indices){
        val firstValue = arr[i]
        val moreRequired = target - firstValue
        
         if (hashMap.containsKey(moreRequired)){
             return intArrayOf(hashMap[moreRequired]!!,i)
         }
        hashMap.put(arr[i],i)
    }

    return intArrayOf(-1,-1)
}