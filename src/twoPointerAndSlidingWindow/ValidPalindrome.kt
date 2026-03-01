package twoPointerAndSlidingWindow




class ValidPalindrome {

    fun validPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {

            if (s[left] != s[right]) {
                return isPalindrome(s, left + 1, right) ||
                        isPalindrome(s, left, right - 1)
            }

            left++
            right--
        }

        return true
    }

    private fun isPalindrome(s: String, l: Int, r: Int): Boolean {
        var left = l
        var right = r

        while (left < right) {
            if (s[left] != s[right]) return false
            left++
            right--
        }

        return true
    }
}