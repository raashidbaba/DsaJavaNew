package basics

import kotlin.math.sqrt


fun main(){
//        printAllDivisors(10)
//    val n = 36
//    val divisors = printAllDivisorsP2(n)
//    println(divisors)
    print(printAllDivisorsP2(36))
}



//time complexity -> O(n)

fun printAllDivisors(n :Int){
    for (i in 1..n){
        if (n%i==0){
            print("${i} ")
        }
    }
}


//second approach
//time complexity -> O(sqrt n)
fun printAllDivisorsP2(n:Int):List<Int>{

    var divisor = ArrayList<Int>()

    for (i in 1..sqrt(n.toDouble()).toInt()){


        if (n%i==0){
//            print("${i} ")
              divisor.add(i)

            if (n/i!=i){
//                print("${n/i} ")
           divisor.add(n/i)
            }

        }



    }
    //O(n log n): N is the number of factors
    return divisor.sorted()
}