package TwoPointerAndSlidingWindow

fun main(){
    val input = "pwwkew"
    val result = lengthOfLongestSubstring(input)
    println("Longest substring length = $result")
}

    fun lengthOfLongestSubstring(str: String): Int {
        if (str.isEmpty()) return 0

        var maxAns = Int.MIN_VALUE
        val set = mutableSetOf<Char>()
        var l = 0

        for (r in str.indices) {
            while (l < r && set.contains(str[r])) {
                set.remove(str[l])
                l++
            }
            set.add(str[r])
            maxAns = maxOf(maxAns, r - l + 1)
        }

        return maxAns
    }




