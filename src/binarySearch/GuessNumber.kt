package binarySearch

// Simulate the GuessGame API
open class GuessGame(private val pick: Int) {

    fun guess(num: Int): Int {
        return when {
            num > pick -> -1   // too high
            num < pick -> 1    // too low
            else -> 0          // correct
        }
    }
}

// Your Solution class extends GuessGame
class Solution(pick: Int) : GuessGame(pick) {

    fun guessNumber(n: Int): Int {
        var left = 1
        var right = n

        while (left <= right) {
            val mid = left + (right - left) / 2
            val res = guess(mid)

            if (res == 0) {
                return mid
            } else if (res < 0) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return -1
    }
}

// Main function to test
fun main() {
    val pick = 6
    val n = 10

    val solution = Solution(pick)
    val result = solution.guessNumber(n)

    println("Picked number is: $result")
}