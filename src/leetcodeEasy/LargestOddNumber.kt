package leetcodeEasy

class LargestOddNumber {
    fun largestOddNumber(num: String): String {

        for (i in num.length - 1 downTo 0) {
            val digit = num[i] - '0'
            if (digit % 2 == 1) {
                return num.substring(0, i + 1)
            }
        }
        return ""
    }

}