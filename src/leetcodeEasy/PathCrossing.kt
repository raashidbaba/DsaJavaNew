package leetcodeEasy


class PathCrossing {
    fun isPathCrossing(path: String): Boolean {
        var x = 0
        var y = 0

        val visited = HashSet<Pair<Int, Int>>()
        visited.add(Pair(x, y))

        for (ch in path) {
            when (ch) {
                'N' -> y++
                'S' -> y--
                'E' -> x++
                'W' -> x--
            }

            val pos = Pair(x, y)
            if (visited.contains(pos)) {
                return true
            }
            visited.add(pos)
        }

        return false
    }
}
