package problems.hard

fun main() {
    val wordSearch2 = WordSearch2()

    println(
        wordSearch2.findWords(
            arrayOf(
                charArrayOf('o', 'a', 'a', 'n'),
                charArrayOf('e', 't', 'a', 'e'),
                charArrayOf('i', 'h', 'k', 'r'),
                charArrayOf('i', 'f', 'l', 'v')
            ),
            arrayOf("oath", "pea", "eat", "rain")
        )
    )

    println(
        wordSearch2.findWords(
            arrayOf(
                charArrayOf('a'),
                charArrayOf('a'),
            ),
            arrayOf("a")
        )
    )


}

class WordSearch2 {
    var m = 0
    var n = 0
    fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
        m = board[0].size
        n = board.size

//        println("m : $m n : $n word : $word ")

        val result = mutableListOf<String>()

        for (word in words) {
            var foundWord = false

            for (i in 0 until m) {
                if (!foundWord) {
                    for (j in 0 until n) {
                        if (!foundWord && exist(i, j, board, word, mutableListOf())) {
                            result.add(word)
                            foundWord = true
                        }
                    }
                }

            }
        }

        return result
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

                if (exist(x - 1, y, board, word.substring(1), tempList)) {
                    return true
                }
            }
            if (!history.contains(Pair(x, y - 1))) {
                val tempList = mutableListOf<Pair<Int, Int>>()
                tempList.addAll(history)
                tempList.add(Pair(x, y))

                if (exist(x, y - 1, board, word.substring(1), tempList)) {
                    return true
                }
            }
            if (!history.contains(Pair(x + 1, y))) {
                val tempList = mutableListOf<Pair<Int, Int>>()
                tempList.addAll(history)
                tempList.add(Pair(x, y))
                if (exist(x + 1, y, board, word.substring(1), tempList)) {
                    return true
                }
            }
            if (!history.contains(Pair(x, y + 1))) {
                val tempList = mutableListOf<Pair<Int, Int>>()
                tempList.addAll(history)
                tempList.add(Pair(x, y))
                if (exist(x, y + 1, board, word.substring(1), tempList)) {
                    return true
                }
            }
        }

        return false
    }
}