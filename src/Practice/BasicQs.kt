package Practice

fun main(){

}



fun reverseString(str:String):String{
    var reverseStr = ""

    for (i in str.length-1 downTo 0){
        reverseStr += str[i]
    }

    return reverseStr
}


fun reverseNumb1(numb:Int):Int{
    var revNo = 0
    var n = numb

    while (numb>0){
        val ld = numb%10
        n = numb/10
        revNo = (revNo*10)+ld
    }
    return n
}




//palindrome -> rev a numb compare with original
fun palindrome1(numb: Int): Boolean {
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



fun fibonacci1(n: Int) {
    var a = 0
    var b = 1

    for (i in 0 until n) {
        print("$a ") // Print the current Fibonacci number
        val temp = a + b // Calculate the next number
        a = b  // Move forward
        b = temp // Update values
    }
}

