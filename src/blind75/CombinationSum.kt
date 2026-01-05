package blind75



    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val combination = mutableListOf<Int>()
        backtrack(0, target, candidates, combination, result)
        return result
    }

    private fun backtrack(
        start: Int,
        target: Int,
        candidates: IntArray,
        combination: MutableList<Int>,
        result: MutableList<List<Int>>
    ) {
        // If the remaining target is 0, we found a valid combination
        if (target == 0) {
            result.add(ArrayList(combination))
            return
        }

        // Try candidates starting from 'start' index
        for (i in start until candidates.size) {
            val current = candidates[i]

            // If current candidate exceeds remaining target, skip
            if (current > target) continue

            // Choose the number
            combination.add(current)

            // Recurse with the reduced target
            backtrack(i, target - current, candidates, combination, result)

            // Backtrack: remove the last number
            combination.removeAt(combination.size - 1)
        }
    }

