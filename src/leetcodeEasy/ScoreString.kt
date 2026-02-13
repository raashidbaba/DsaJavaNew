package leetcodeEasy


class ScoreString {
    fun scoreOfString(s: String): Int {
        var score = 0

        for (i in 0 until s.length - 1) {

            val diff = Math.abs(s[i] - s[i + 1])
            score += diff
        }

        return score
    }
}