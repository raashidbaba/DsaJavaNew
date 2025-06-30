package recursion


fun main(){
    print(factorial(4))
}


fun factorial(n:Int):Int{
    if (n==0){
        return 1
    }

    return n * factorial(n-1)
}