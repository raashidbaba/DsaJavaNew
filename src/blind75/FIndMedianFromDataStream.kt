package blind75
import java.util.PriorityQueue


class MedianFinder {

    // Max heap for the smaller half
    private val small = PriorityQueue<Int>(compareByDescending { it })

    // Min heap for the larger half
    private val large = PriorityQueue<Int>()

    fun addNum(num: Int) {
        // 1) Add to max-heap
        small.add(num)

        // 2) Ensure all elements in small <= large
        if (small.isNotEmpty() && large.isNotEmpty() && small.peek() > large.peek()) {
            large.add(small.poll())
        }

        // 3) Balance the sizes: small can be at most 1 bigger than large
        if (small.size > large.size + 1) {
            large.add(small.poll())
        } else if (large.size > small.size) {
            small.add(large.poll())
        }
    }

    fun findMedian(): Double {
        return if (small.size == large.size) {
            // Even: average of tops
            (small.peek().toDouble() + large.peek().toDouble()) / 2.0
        } else {
            // Odd: top of small
            small.peek().toDouble()
        }
    }
}