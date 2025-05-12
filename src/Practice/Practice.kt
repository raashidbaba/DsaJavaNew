package Practice


fun main() {
    val revString = "hello"
    val numsss = 153
    val arr = arrayOf(1, 2, 3, 4, 6,2, 7, 8)

//    duplicatesStr(revString)
//        print(reverStr(revString))
//    print(reverseNumb(numsss))
//    print("Count of digits in $numsss: ${countDigits(numsss)}")
//    print(palindrome(numsss))
//    print(armStrong(numsss))
//    allDivisors(40)
//        print(isPrime(13))
//    print(fibonacci(5))
//    fibonacci(5)
    duplicates(arr)
//        print(missingNumb(arr,18))
//    pattern1(5)
//    p1(5)
//      p5(5)
//    p6(5)
//    val arr1 = arrayOf(1,2,3,4,5)
//    arr1.set(2,30)
//    for (i in arr1){

//        if (1 in arr1){
//            print("yes")
//        }

//    }
//    val theMap = HashMap<String, Int>()
//
//    theMap["one"] = 1
//    theMap["two"] = 2
//    theMap["three"] = 3
//    theMap["four"] = 4
//
//    print(theMap)
//
//    for ((name, marks) in theMap) {
//        println("$name scored $marks")
//    }
//
//
//    val set = setOf(1,2,4,5)
//
//    print(set)
//
//    for (i in set){
//        print(i)
//    }
}


//reverse a string
fun reverStr(input: String): String {
    var res = ""
    for (i in input.length - 1 downTo 0) {
        res += input[i]
    }
    return res
}


//count digits
fun countDigits(n: Int): Int {
    var count = 0
    var numbs = n
    while (numbs > 0) {
        count++
        numbs = numbs / 10
    }
    return count
}

//reverse numb
fun reverseNumb(n: Int): Int {
    var count = 0
    var numbs = n
    var revNo = 0
    while (numbs > 0) {
        val lastDigit = numbs % 10
        count++
        numbs = numbs / 10
        revNo = (revNo * 10) + lastDigit
    }

    return revNo
}


//palindrome -> rev a numb compare with original
fun palindrome(numb: Int): Boolean {
    var n = numb
    var revNo = 0
    while (n > 0) {
        val lD = n % 10
        n = n / 10
        revNo = (revNo * 10) + lD
    }

    if (numb == revNo) {
        return true
    } else {
        return false
    }
}


//arm strong number -> is a number that is equal to the
// sum of its own digits each raised to the power of the number of digits.
fun armStrong(numb: Int): Boolean {
    var digits = numb.toString().length
    var n = numb
    var revNo = 0
    var sum = 0
    while (n > 0) {
        val lD = n % 10
        n = n / 10
        revNo = (revNo * 10) + lD

        //sum + cube of number everytime
        //sum stores the whole value
//        sum = (sum) + lD * lD * lD
        sum += Math.pow(lD.toDouble(),digits.toDouble()).toInt()
        print("sum ${ sum}")

    }

    if (sum == numb) {
        return true
    } else {
        return false
    }
}


//all divisiors of a number.
fun allDivisors(numb: Int) {

    for (i in 1..numb) {
        val div = numb % i
        if (div == 0) {
            print("${i} ")
        }
    }
}


//check for prime
fun isPrime(numb: Int): Boolean {
    var count = 0
    for (i in 1..numb) {
        if (numb % i == 0) {
            count++
        }
    }
    if (count == 2) {
        return true
    } else {
        return false
    }
}


//fibonacci series
/*fun fibonacci(n: Int) {
    var a = 0
    var b = 1

    for (i in 0 until n) {
        print("$a ") // Print the current Fibonacci number
        val temp = a + b // Calculate the next number
        a = b  // Move forward
        b = temp // Update values
    }
}*/

fun fibonacci(n: Int) {
    var a = 0
    var b = 1

    // Print Fibonacci numbers
    for (i in 0 until n) {
        print("${a} ")
        val temp = a + b
        a = b
        b = temp
    }
}


fun duplicatesStr(input: String){
    for(i in 0..input.length-1){
        for (j in i+1 until input.length){
            if (input[i]==input[j]){
                print("dup ${input[i]}")
            }
        }
    }
}


//find duplicates in an array
fun duplicates(arr: Array<Int>) {
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) {
                println("Duplicate found: ${arr[i]}")
            }
        }
    }
}


//find missing number
//number will be provided
fun missingNumb(arr: Array<Int>, num: Int): Int {
    for (i in 1..num) {
        if (i !in arr) {
            return i
        }

    }

    return -1
}


/**
 * *
 * * *
 * * * *
 */

fun pattern1(num: Int) {
    //say 1 to 5
    //first 1
    for (i in 1..num) {

        //for 1st we want j to run once
        for (j in 1..i) {
            print("*")
        }

        println()

    }
}


/**
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

fun p1(num: Int) {
    for (i in num..0) {

        for (j in i..0) {
            print(j)
        }

        println()

    }
}






/**
 * * * *
 * * *
 * *
 *
 */
fun p5(num: Int) {
    for (i in 1..num) {

        for (j in 1..num-i+1) {
            print("*")
        }

        println()

    }
}




// space star space
fun p6(num:Int){

    //outer loop
    for (i in 0..num){

        //space loop
        for (j in 0..num-i-1){
            print(" ")
        }

        //star loop
        for (j in 0..2*i+1){
            print("*")
        }

        //space loop
        for (j in 0..num-i-1){
            print(" ")
        }

        println()
    }


}

















//    println(Practice.MIN)
/* val human = Person("bob",12).apply {
     name = " jum"
     height = 20
 }*/

//    println(human.name)
//    println(human.height)
/*
    val name : String = "me"
    name.let {
        println("hello $it")
    }*/

/*val list = mutableListOf(1,2,3).also {
    print("org $it")
}
list.add(5)*/
/*val text = "hello"
    println(text.addExclamation())*/

//}


/*
fun numberFlow(): Flow<Int> = flow {
    for (i in 1..5) {
        emit(i) // Emit values one by one
        delay(500) // Simulate delay
    }
}
*/

//var  hello  :Int = 20
//
fun String.addExclamation(): String {
    return this + "!"
}


//class Person(var name:String, var height:Int){}


//Arrays

//in kotlin we have when instead of switch statement
//fun main(args: Array<String>) {
    /*val day = 2

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)*/


//    val bus = setOf("app","app","app")
//    print(bus.toString())

//    val arr1 = listOf(1,2,3,4,5)
//    arr1.forEach {
//        print(it)
//    }

//    fun main() {
//        val theSet = mutableSetOf(10, 20, 30)
//
//        theSet.add(40)
//        theSet.add(50)
//        println(theSet)
//
//        theSet.remove(10)
//        theSet.remove(30)
//        println(theSet)

//    }

//}
//
//fun main() {
//    // Creating a HashMap
//    val studentMarks = hashMapOf("Alice" to 90, "Bob" to 85, "Charlie" to 88)
//
//    // Adding a new entry
//    studentMarks["David"] = 92
//
//    // Accessing values
//    println("Alice's marks: ${studentMarks["Alice"]}")
//
//    // Iterating through the HashMap
//    for ((name, marks) in studentMarks) {
//        println("$name scored $marks")
//    }
//}


