package leetcodeEasy


class MaxLengthBwEqualCharacters {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        val firstIndex = IntArray(26) { -1 }
        var maxLen = -1

        for (i in s.indices) {
            val c = s[i] - 'a'
            if (firstIndex[c] == -1) {

                firstIndex[c] = i
            } else {

                val lengthBetween = i - firstIndex[c] - 1
                maxLen = maxOf(maxLen, lengthBetween)
            }
        }

        return maxLen
    }
}