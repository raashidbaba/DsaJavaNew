package blind75

fun main(){

    val nums = arrayOf(1,2,3,4,1,7)
//    print( duplicatesFun(nums))
    print(dupFunBetterSol(nums))


}


//Brute force sol
//T.C -> 0(n*n) -> worst case

//var booleanCheckk = false
fun duplicatesFun(nums: Array<Int>):Boolean{
    for (i in 0..nums.size){
       for (j in i+1 until nums.size){

           if (nums[i]==nums[j]){
               return true
           }

       }


    }
    return false
}



//better solution
//T.C = 0(n)
//S.c = 0(n) -> space comp increased bcz we created a hash set.
fun dupFunBetterSol(nums:Array<Int>):Boolean{
    val hashSet = mutableSetOf<Int>()

    for (i in nums){
        if (nums.contains(i)){
            return true
        }
            hashSet.add(i)
    }
return false
}


fun sort(nums:Array<Int>){
    nums.sorted()
}





