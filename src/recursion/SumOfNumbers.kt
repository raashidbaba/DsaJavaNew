package recursion

fun main(){
//    sumOfNumbers(3,0)
    print(sumOfNumbers(5))
}



//parameterised
fun sumOfNumbers(i:Int,sum:Int){
    if (i<1){
        print(sum)
        return
    }
    sumOfNumbers(i-1,sum+i)

}


//functional
fun sumOfNumbers(n:Int):Int{
    if (n==0){
        return 0
    }

    return n + sumOfNumbers(n-1)
}