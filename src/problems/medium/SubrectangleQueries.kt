package problems.medium

fun main() {
    val subrectangleQueries =
        SubrectangleQueries(arrayOf(intArrayOf(1, 2, 1), intArrayOf(4, 3, 4), intArrayOf(3, 2, 1), intArrayOf(1, 1, 1)))

    println(subrectangleQueries.getValue(0, 2))
    println(subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5))
    println(subrectangleQueries.getValue(0, 2))
    println(subrectangleQueries.getValue(3, 1))
    println(subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10))
    println(subrectangleQueries.getValue(3, 1))
    println(subrectangleQueries.getValue(0, 2))
}

class SubrectangleQueries(private val rectangle: Array<IntArray>) {

    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        for (i in row1..row2) {
            for (j in col1..col2) {
                rectangle[i][j] = newValue
            }
        }
//
//        for (row in rectangle) {
//            println(row.contentToString())
//        }
    }

    fun getValue(row: Int, col: Int): Int {
        return rectangle[row][col]
    }
}