package Recursion



fun main(){
//    val value = "madam"
//    print(palindrome(0,value))

}


fun palindrome(i:Int,n:String):Boolean{
    if (i>=n.length/2){
        return true
    }
    if (n[i]!=n[n.length-i-1]){
        return false
    }

    return palindrome(i+1,n)
}

