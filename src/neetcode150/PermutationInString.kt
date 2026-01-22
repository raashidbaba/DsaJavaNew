package neetcode150

    class PermutationInString {
        fun checkInclusion(s1: String, s2: String): Boolean {
            if (s1.length > s2.length) return false

            val s1Count = IntArray(26)
            val s2Count = IntArray(26)
            for (i in s1.indices) {
                s1Count[s1[i] - 'a']++
                s2Count[s2[i] - 'a']++
            }

            var matches = 0
            for (i in 0 until 26) {
                if (s1Count[i] == s2Count[i]) matches++
            }

            var l = 0
            for (r in s1.length until s2.length) {
                if (matches == 26) return true

                val index = s2[r] - 'a'
                s2Count[index]++
                if (s1Count[index] == s2Count[index]) {
                    matches++
                } else if (s1Count[index] + 1 == s2Count[index]) {
                    matches--
                }

                val leftIndex = s2[l] - 'a'
                s2Count[leftIndex]--
                if (s1Count[leftIndex] == s2Count[leftIndex]) {
                    matches++
                } else if (s1Count[leftIndex] - 1 == s2Count[leftIndex]) {
                    matches--
                }
                l++
            }
            return matches == 26
        }
    }
