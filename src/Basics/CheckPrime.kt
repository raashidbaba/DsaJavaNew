package Basics

import kotlin.math.sqrt

fun main(){
    print(checkPrime(12))
}



fun checkPrime(n:Int):Boolean{
    var count = 0
    for (i in 1..sqrt(n.toDouble()).toInt()){


        if (n%i==0){
//            print("${i} ")
            count++


            if (n/i!=i){
//                print("${n/i} ")
                count++

            }

        }

    }

 return if (count==2){
     true
 }else{
     false
 }
}