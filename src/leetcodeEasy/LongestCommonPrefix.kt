package leetcodeEasy



class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        strs.sort()

        val first = strs.first()
        val last = strs.last()

        var i = 0

        while (i < first.length &&
            i < last.length &&
            first[i] == last[i]) {
            i++
        }

        return first.substring(0, i)
    }
}