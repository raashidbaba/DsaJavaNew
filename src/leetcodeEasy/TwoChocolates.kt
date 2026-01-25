package leetcodeEasy


class TwoChocolates {
    fun buyChoco(prices: IntArray, money: Int): Int {
        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE

        for (p in prices) {
            if (p < min1) {
                min2 = min1
                min1 = p
            } else if (p < min2) {
                min2 = p
            }
        }

        val cost = min1 + min2
        return if (cost > money) money else money - cost
    }
}