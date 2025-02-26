package Recursion

fun main(){
//    f1()
//    f2()
//    f3(1,4)
    f4(4,1)
}



fun f1(){
    println(1)
    f1()
}



var count = 0
fun f2(){
    if (count==5){
        return
    }
    count++
    println(count)
    f2()
}


//print name 1 to n time using recursion
fun f3(i:Int,n:Int){
    if (i>n){
        return
    }
    f3(i+1,n)
    println("king")

}


//print n to 1 times using recursion
fun f4(i:Int,n:Int){
    if (i<1){
        return
    }
    println(i)
    f4(i-1,n)

}