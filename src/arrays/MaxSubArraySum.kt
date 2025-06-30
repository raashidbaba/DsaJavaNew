package arrays

fun main() {
    var arr = intArrayOf(-2, -3, 4, -1, -2, 1, 5, -3)
    print(maxSubArray(arr))

}


//TC -> 0(n power 3)
fun bruteMaxSubArraySum(nums: IntArray): Int {
    var max = Int.MIN_VALUE

    for (i in nums.indices) {

        for (j in i..nums.size - 1) {
            var sum = 0
            for (k in i..j) {
                sum += nums[k]

            }
            max = maxOf(sum, max)
        }
    }
    return max
}


//kadane's algo
//TC -> 0(n)
fun maxSumSubArray(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    var sum = 0
    for (i in nums.indices) {
        sum += nums[i]

        if (sum > max) {
            max = sum
        }
        if (sum < 0) {
            sum = 0
        }
    }
    return max
}


fun maxSubArray(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    var sum = 0
    var ansStart = -1
    var ansEnd = -1
    var start = 0

    for (i in nums.indices) {
        sum += nums[i]

        if (sum > max) {
            max = sum
            ansStart = start
            ansEnd = i
        }

        if (sum < 0) {
            sum = 0
            start = i + 1
        }
    }

    println("Max subarray from index $ansStart to $ansEnd")
    return max
}

