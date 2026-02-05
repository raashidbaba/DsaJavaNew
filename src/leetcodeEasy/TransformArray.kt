package leetcodeEasy


class TransformArray {
    fun constructTransformedArray(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n)
        for (i in 0 until n) {
            val x = nums[i]
            if (x == 0) {
                result[i] = 0
            } else {
                // move x positions in circular manner
                val move = ((i + x) % n + n) % n
                result[i] = nums[move]
            }
        }
        return result
    }
}