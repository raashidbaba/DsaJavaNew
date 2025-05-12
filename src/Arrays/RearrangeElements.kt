package Arrays

fun main(){
val arr = intArrayOf(3,1,-2,-5,2,-4)
    print(rearrangeElements(arr).joinToString())
}



fun rearrangeElements(nums:IntArray): IntArray {
    val ans = IntArray(nums.size)
    var posIndex = 0
    var negIndex = 1

    for (i in nums.indices ){
        if (nums[i]<0){
            ans[negIndex] = nums[i]
            negIndex +=2


        }else{
            ans[posIndex] = nums[i]
            posIndex += 2
        }
    }
return ans

}