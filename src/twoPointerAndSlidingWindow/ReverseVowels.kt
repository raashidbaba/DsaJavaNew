package twoPointerAndSlidingWindow

class ReverseVowels {
    fun reverseVowels(s: String): String {
        var i = 0
        var j = s.length - 1
        val chars = s.toCharArray()

        while (i < j) {

            if (!isVowel(chars[i])) {
                i++
            } else if (!isVowel(chars[j])) {
                j--
            } else {
                swap(chars, i, j)
                i++
                j--
            }
        }

        return String(chars)
    }

    fun isVowel(ch: Char): Boolean {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
    }

    fun swap(chars: CharArray, i: Int, j: Int) {
        val temp = chars[i]
        chars[i] = chars[j]
        chars[j] = temp
    }
}