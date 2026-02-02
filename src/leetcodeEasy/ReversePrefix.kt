package leetcodeEasy




class ReversePrefix {
    fun reversePrefix(word: String, ch: Char): String {
        val idx = word.indexOf(ch)
        if (idx == -1) return word

        val prefix = word.substring(0, idx + 1)
        val reversed = prefix.reversed()
        val suffix = word.substring(idx + 1)

        return reversed + suffix
    }
}