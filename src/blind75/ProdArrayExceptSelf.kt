package blind75


fun main(){
    val arr = intArrayOf(1,2,3,4)
    val sol =
    print(prodArray(arr).contentToString())
}



fun prodArray( nums:IntArray):IntArray{
    val result = IntArray(nums.size){1}
    var prefix = 1

    for (i in nums.indices){
        result[i] = prefix
        prefix *= nums[i]
    }
    var postfix = 1
    for(i in nums.size-1 downTo 0){
        result[i] *= postfix
        postfix *= nums[i]

    }

return result
}
