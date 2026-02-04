package leetcodeEasy



class CountConsistentStrings {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val seen = BooleanArray(26)

        for (ch in allowed) {
            seen[ch - 'a'] = true
        }

        var count = 0

        for (word in words) {
            var valid = true

            for (ch in word) {
                if (!seen[ch - 'a']) {
                    valid = false
                    break
                }
            }

            if (valid) count++
        }

        return count
    }
}