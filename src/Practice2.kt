//class Car {
//   var brand = "toyota"
//}

// open class Animal {
//    open fun makeSound() {
//        println("Animal makes a sound")
//    }
//}
//
//
//class Dog:Animal(){
//    override fun makeSound() {
//        super.makeSound()
//    }
//    fun bark(){
//        makeSound()
//    }
//}
//
//
//
//fun main(){
//    var car = Car()
//    print(car.brand)
//
//}
//
//data class Point(val x: Int, val y: Int) {
//    operator fun div(other: Point): Point {
//        return Point(x + other.x, y + other.y)
//    }
//}

//fun main() {
   /* val p1 = Point(2, 3)
    val p2 = Point(4, 5)

    val result = p1 + p2  // This calls our custom `+` function!
    println(result)  // Output: Point(x=6, y=8)*/
    var str = "hello"
    var n = 121
//    print(rev(str))
//    print(count(n))
//    print(revNum(n))
//   print(palindrome1(n))
//        print(armStrong(n))
//    fib(5)
//    p01(5)
//    p02(5)
//        po6(5)



//    val mapp = HashMap<String,Int>()

//    mapp["ab"]= 1

//    print(mapp)


//    print(str.addExclamation())
//    print(reverStr(str))

//    print(coun(n))
//        print(rev(n))
//    print(palindrome(n))
//    print(dup1(arrrrr))
//    val arrr = arrayOf(1,2,3,4,3,5)

//    dup1(arr = arrr)

//    fibb(10)

//    p0(5)
//pp(6)
//


//}
/*
fun fib(n:Int){
    var a = 0
    var b = 1

    for (i in 0..n){
        print(a)
        var temp = a+b
        a = b
        b = temp
    }
}
*/


fun p01(n:Int){
    for (i in 1..n){
        for (j in 1..i){
            print("*")
        }
        println()
    }

}



fun p02(n:Int) {
    for (i in 1..n) {
        for (j in 1..n - i + 1){
            println("*")
    }
    println()
}
}


fun po6(n:Int){
    for (i in 0..n){

        //space
        for (j in 0..i){
            print(" ")
        }


        for (j in 0..(2*n-2*(i+1))) {
            print("*")
        }

        for (j in 0..i){
            print(" ")
        }
 println()

    }
}


/*fun dup(arr:Array<Int>){
    for (i in arr.indices){
        for (j in i+1 until arr.size){
            if (arr[i]==arr[j]){
                print(arr[i])
            }
        }

    }
}*/


/*fun dup(arr: Array<Int>){

    for (i in arr.indices){
        for (j in i+1 until arr.size){
            *//*if (arr[i] == arr[j]){
                print(arr[i])
            }*//*
            print(arr[i] == arr[j])
        }
    }
}*/




fun String.exclamation():String{
    return this + "!"
}



fun rev(str:String):String{
    var rev = ""
    for (i in str.length-1 downTo 0){
        rev += rev[i]
    }

    return rev
}


//fun coun(n:Int):Int{
//    var count = 0
//    var num = n
//
//    while (num>0){
//        count++
//        num = num/10
//    }
//
//    return count
//}

//
//fun rev(n:Int):Int{
//    var num = n
//    var rev = 0
//    while (num>0){
//        var ld = num%10
//        num = num/10
//        rev = (rev*10)+ld
//
//
//
//    }
//    return rev
//}


/*

fun palindrome1(n:Int):Boolean{
    var num = n
    var rev = 0

    while (num>0){
        var ld = num%10
        num = num/10
        rev = (rev*10) + ld


    }
    return rev==n
}*/


/*
fun arm(n:Int):Boolean{
    var num = n
    var rev = 0
    var sum = 0

    while (num>0){
        var ld = num%10

        num = num/10
//        rev =

        sum = (sum)+ ld*ld*ld
    }
    return sum == n
}*/

/*
fun dup1(arr:Array<Int>){
    for (i in arr.indices){
        for (j in i+1 until arr.size){

            if (arr[i]==arr[j]){
                print(arr[i])
            }
        }
    }

}*/



/*
fun fibb(n:Int){
    var a = 0
    var b = 1

    for (i in 0..n){
        print("$a ")
        var temp = a+b
        a = b
        b = temp
    }

}*/

fun p0(n:Int){
    for (i in 1..n){
        for (j in 1..n-i+1) {
            print("*")
        }
        println()
    }


}




fun pp(n:Int){
    for (i in 0..n){

        for (j in 1..n-i-1){
            print(" ")
        }

        for (j in 1..2*i+1){
            print("*")
        }

        for (j in 1..n-i-1){
            print(" ")
        }
        println()


    }
}



open class Anima{
   open fun makeSound(){
        print("animal sound")
    }
}

class Dog:Anima(){
//    override fun makeSound() {
//        super.makeSound()
//        print("cat meow")
//    }
fun catsSound(){
    print("catawz")
}
}


fun main(){
    val dog =Dog()
    dog.makeSound()
    dog.catsSound()

}