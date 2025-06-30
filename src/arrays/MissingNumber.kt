package arrays

fun main(){
    val arr = intArrayOf(1,2,4,5)

//    print(missingNumb(arr))
    print(optimalMissingNumber(arr,5))
}


//brute force sol
//TC -> 0(2 power n)
fun missingNumb(arr:IntArray):Int{
    for (i in 1..arr.size+1){

        var flag = 0
        for (j in arr.indices){
            if (arr[j]==i){
                flag = 1
                break
            }
        }
        if (flag==0){
            return i
        }
    }
    return -1
}



fun optimalMissingNumber(arr:IntArray,n:Int):Int{
    val hashArr = IntArray(n+1)
    for (i in 0 until n-1){
        hashArr[arr[i]] = 1
    }
    for (j in 1 until n){
        if (hashArr[j]==0){
            return j
        }
    }
    return -1
}


