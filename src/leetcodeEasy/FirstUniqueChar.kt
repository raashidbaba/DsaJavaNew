package leetcodeEasy



class FirstUniqueChar {
    fun firstUniqChar(s: String): Int {

        val freq = IntArray(26)

        for (ch in s) {
            freq[ch - 'a']++
        }

        for (i in s.indices) {
            if (freq[s[i] - 'a'] == 1) {
                return i
            }
        }

        return -1
    }
}