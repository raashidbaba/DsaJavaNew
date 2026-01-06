package blind75

fun main(){


    fun exist(board: Array<CharArray>, word: String): Boolean {
        val rows = board.size
        val cols = board[0].size

        fun dfs(r: Int, c: Int, index: Int): Boolean {
            // All characters matched
            if (index == word.length) return true

            // Out of bounds OR mismatch
            if (r !in 0 until rows || c !in 0 until cols || board[r][c] != word[index])
                return false

            // Mark visited (temporary)
            val temp = board[r][c]
            board[r][c] = '#'

            // Explore 4 directions
            val found = dfs(r + 1, c, index + 1) ||
                    dfs(r - 1, c, index + 1) ||
                    dfs(r, c + 1, index + 1) ||
                    dfs(r, c - 1, index + 1)

            // Undo (backtrack)
            board[r][c] = temp

            return found
        }

        // Start DFS from every cell
        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (dfs(r, c, 0)) return true
            }
        }

        return false
    }
}
