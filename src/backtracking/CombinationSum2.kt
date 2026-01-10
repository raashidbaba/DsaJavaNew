package backtracking

class Solution {

    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        candidates.sort()
        backtrack(candidates, target, 0, mutableListOf(), result)
        return result
    }

    private fun backtrack(
        candidates: IntArray,
        target: Int,
        start: Int,
        current: MutableList<Int>,
        result: MutableList<List<Int>>
    ) {
        if (target == 0) {
            result.add(ArrayList(current))
            return
        }

        for (i in start until candidates.size) {
            // skip duplicates at the same recursion level
            if (i > start && candidates[i] == candidates[i - 1]) continue

            val value = candidates[i]
            if (value > target) break // no need to continue if value exceeds remaining target

            current.add(value)
            // move to next index i + 1, because each number can be used once
            backtrack(candidates, target - value, i + 1, current, result)
            current.removeAt(current.size - 1)
        }
    }
}
