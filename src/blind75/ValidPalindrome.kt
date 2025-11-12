package blind75


fun main(){
 val str = "A man, a plan, ma canal: Panama"
    print(validPalindromeTwoPointer(str))
}




fun validPalindromeTwoPointer(s:String):Boolean{
    var left = 0
    var right = s.length-1

    while (left<right){

        //this inner while loops skips over characters that aren’t letters or digits.
        //that's why we need to keep this check again left < right
        //else it can cause index out of bound exception.
        while (left < right && !s[left].isLetterOrDigit()){
            left++
        }


        while (!s[right].isLetterOrDigit()){
            right--
        }

        if (left < right && left < right) {
            if (s[left].lowercaseChar() != s[right].lowercaseChar()) {
                return false
            }
            left++
            right--
        }

    }
    return true
}