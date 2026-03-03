package twoPointerAndSlidingWindow



class MagicalString {
    fun magicalString(n: Int): Int {
        if (n <= 0) return 0
        if (n <= 3) return 1

        val s = IntArray(n)
        s[0] = 1
        s[1] = 2
        s[2] = 2

        var countOnes = 1
        var read = 2
        var write = 3
        var curr = 1

        while (write < n) {

            val times = s[read]
            for (i in 0 until times) {
                if (write >= n) break

                s[write] = curr

                if (curr == 1) {
                    countOnes++
                }

                write++
            }

            curr = if (curr == 1) 2 else 1
            read++
        }

        return countOnes
    }
}