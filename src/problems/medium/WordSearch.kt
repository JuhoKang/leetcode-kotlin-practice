package problems.medium

fun main() {
    val wordSearch = WordSearch()

    println(
        wordSearch.exist(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ), "ABCCED"
        )
    )
    println(
        wordSearch.exist(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ), "SEE"
        )
    )
    println(
        wordSearch.exist(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ), "ABCB"
        )
    )

    println(
        wordSearch.exist(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'E', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ), "ABCESEEEFS"
        )
    )
}

//TODO try backtracking
class WordSearch {
    var m = 0
    var n = 0
    fun exist(board: Array<CharArray>, word: String): Boolean {
        m = board[0].size
        n = board.size

//        println("m : $m n : $n word : $word ")

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (exist(i, j, board, word, mutableListOf())) {
                    return true
                }
            }
        }
        return false
    }

    private fun exist(
        x: Int,
        y: Int,
        board: Array<CharArray>,
        word: String,
        history: MutableList<Pair<Int, Int>>
    ): Boolean {
        if (word.isEmpty()) {
            return true
        }

//        println("m : $m n : $n word : $word ")

        if (x < 0 || y < 0 || x > m - 1 || y > n - 1) {
            return false
        }

//        println("x : $x y : $y word : $word ")
//        println(history)

        if (board[y][x] == word[0]) {
            if (!history.contains(Pair(x - 1, y))) {
                val tempList = mutableListOf<Pair<Int, Int>>()
                tempList.addAll(history)
                tempList.add(Pair(x, y))

                if(exist(x - 1, y, board, word.substring(1), tempList)) {
                    return true
                }
            }
            if (!history.contains(Pair(x, y - 1))) {
                val tempList = mutableListOf<Pair<Int, Int>>()
                tempList.addAll(history)
                tempList.add(Pair(x, y))

                if(exist(x, y - 1, board, word.substring(1), tempList)) {
                    return true
                }
            }
            if (!history.contains(Pair(x + 1, y))) {
                val tempList = mutableListOf<Pair<Int, Int>>()
                tempList.addAll(history)
                tempList.add(Pair(x, y))
                if(exist(x + 1, y, board, word.substring(1), tempList)) {
                    return true
                }
            }
            if (!history.contains(Pair(x, y + 1))) {
                val tempList = mutableListOf<Pair<Int, Int>>()
                tempList.addAll(history)
                tempList.add(Pair(x, y))
                if(exist(x, y + 1, board, word.substring(1), tempList)) {
                    return true
                }
            }
        }

        return false
    }
}