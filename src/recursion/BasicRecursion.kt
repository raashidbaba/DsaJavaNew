package recursion

fun main(){
//    f1()
//    f2()
//    f3(1,4)
//    f4(4,1)
//    f5(5,5)
    f6(1,5)
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



//print 1 to n using backtracking
fun f5(i:Int,n:Int){
    if (i<1){
        return
    }
    f5(i-1,n)
    println(i)
}


//print n to 1 using backtracking
fun f6(i:Int,n:Int){
    if (i>n){
        return
    }
    f6(i+1,n)
    println(i)
}