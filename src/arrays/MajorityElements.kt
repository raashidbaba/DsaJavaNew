package arrays

fun main(){
    val arr = intArrayOf(7,7,5,7,5,1,5,7,5,5,7,7,5,5,5)
    print(majorityElements(arr))
}


//optimal solution
//Moore's voting algorithm
fun majorityElements(nums:IntArray):Int{
    var count = 0
    var element = 0

    for (i in nums.indices){
        if (count==0){
            count = 1
            element = nums[i]
        }
        else if (nums[i]== element){
            count++
        }
        else{
            count--
        }
    }

    var count2 = 0
    for (i in nums.indices){
        if (nums[i]==element){
            count2++
        }
        if (count2> (nums.size/2)){
            return element
        }
    }
    return -1
}