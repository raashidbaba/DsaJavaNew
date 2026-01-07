package neetcode150

fun main(){

}

    fun isValidSudoku(board: Array<CharArray>): Boolean {

        val rows = Array(9) { HashSet<Char>() }
        val cols = Array(9) { HashSet<Char>() }
        val boxes = Array(9) { HashSet<Char>() }

        for (r in 0 until 9) {
            for (c in 0 until 9) {
                val value = board[r][c]

                // Skip empty cells
                if (value == '.') continue

                // Check row
                if (!rows[r].add(value)) return false

                // Check column
                if (!cols[c].add(value)) return false

                // Determine sub-box index
                val boxIndex = (r / 3) * 3 + (c / 3)

                // Check box
                if (!boxes[boxIndex].add(value)) return false
            }
        }

        return true
    }

