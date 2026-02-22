package leetcodeEasy


class IsPalindrome {
    fun isPalindrome(x: Int): Boolean {

        // Negative numbers are not palindrome
        // Numbers ending with 0 (except 0 itself) are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) return false

        var original = x
        var reversedHalf = 0

        while (original > reversedHalf) {
            reversedHalf = reversedHalf * 10 + original % 10
            original /= 10
        }

        // For even digits: original == reversedHalf
        // For odd digits: original == reversedHalf / 10
        return original == reversedHalf || original == reversedHalf / 10
    }
}