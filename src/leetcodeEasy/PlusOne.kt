package leetcodeEasy


class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {

            if (digits[i] < 9) {
                digits[i]++
                return digits
            }

            digits[i] = 0
        }

        // If all digits were 9
        val result = IntArray(digits.size + 1)
        result[0] = 1

        return result
    }
}