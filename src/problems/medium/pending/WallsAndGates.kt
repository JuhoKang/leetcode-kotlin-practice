package problems.medium.pending

import kotlin.math.min
import kotlin.comparisons.minOf

fun main() {
    val wallsAndGates = WallsAndGates()

//    wallsAndGates.wallsAndGates(
//        arrayOf(
//            intArrayOf(Int.MAX_VALUE, -1, 0, Int.MAX_VALUE),
//            intArrayOf(Int.MAX_VALUE, Int.MAX_VALUE, Int.MAX_VALUE, -1),
//            intArrayOf(Int.MAX_VALUE, -1, Int.MAX_VALUE, -1),
//            intArrayOf(0, -1, Int.MAX_VALUE, Int.MAX_VALUE)
//        )
//    )

    wallsAndGates.wallsAndGates(
        arrayOf(
            intArrayOf(
                0,
                2147483647,
                -1,
                2147483647,
                2147483647,
                -1,
                -1,
                0,
                0,
                -1,
                2147483647,
                2147483647,
                0,
                -1,
                2147483647,
                2147483647,
                2147483647,
                2147483647,
                0,
                2147483647,
                0,
                -1,
                -1,
                -1,
                -1,
                2147483647,
                -1,
                -1,
                2147483647,
                2147483647,
                -1,
                -1,
                0,
                0,
                -1,
                0,
                0,
                0,
                2147483647,
                0,
                2147483647,
                -1,
                -1,
                0,
                -1,
                0,
                0,
                0,
                2147483647
            ),
            intArrayOf(
                2147483647,
                0,
                -1,
                2147483647,
                0,
                -1,
                -1,
                -1,
                -1,
                0,
                0,
                2147483647,
                2147483647,
                -1,
                -1,
                2147483647,
                -1,
                -1,
                2147483647,
                2147483647,
                -1,
                0,
                -1,
                2147483647,
                0,
                2147483647,
                -1,
                2147483647,
                0,
                2147483647,
                0,
                2147483647,
                -1,
                2147483647,
                0,
                2147483647,
                -1,
                2147483647,
                0,
                2147483647,
                2147483647,
                0,
                -1,
                2147483647,
                -1,
                -1,
                -1,
                0,
                2147483647
            )
        )
    )
}

class WallsAndGates() {
    private lateinit var grid: Array<IntArray>
    private lateinit var checkGrid: Array<BooleanArray>

    fun wallsAndGates(rooms: Array<IntArray>): Unit {
        grid = rooms

//        for (i in 0..rooms.lastIndex) {
//            for (j in 0..rooms[i].lastIndex) {
//                if (rooms[i][j] == 0) {
//                    println("GATE x $j y $i ")
//                    checkGrid = Array(grid.size) { BooleanArray(grid[0].size) { false } }
//                    checkRooms(j - 1, i, 1)
//                    checkRooms(j + 1, i, 1)
//                    checkRooms(j, i - 1, 1)
//                    checkRooms(j, i + 1, 1)
//
//                    for (i in 0..rooms.lastIndex) {
//                        for (j in 0..rooms[i].lastIndex) {
//                            print("${checkGrid[i][j]} ")
//                        }
//                        println()
//                    }
//
//                }
//            }
//        }
        for (i in 0..rooms.lastIndex) {
            for (j in 0..rooms[i].lastIndex) {
                if (rooms[i][j] == Int.MAX_VALUE) {
                    println("GATE x $j y $i ")
                    checkGrid = Array(grid.size) { BooleanArray(grid[0].size) { false } }
                    grid[i][j] = getClosest(j - 1, i, j, i, 1)

                    for (i in 0..rooms.lastIndex) {
                        for (j in 0..rooms[i].lastIndex) {
                            print("${checkGrid[i][j]} ")
                        }
                        println()
                    }

                }
            }
        }


        for (i in 0..rooms.lastIndex) {
            for (j in 0..rooms[i].lastIndex) {
                print("${grid[i][j]} ")
            }
            println()
        }
    }

    fun getClosest(x: Int, y: Int, xB: Int, yB: Int, dist: Int): Int {
        if (x < 0 || y < 0 || x > grid[0].lastIndex || y > grid.lastIndex) {
            return Int.MAX_VALUE
        }

        if (x == xB && y == yB) {
            return Int.MAX_VALUE
        }

        println("x $x y $y dist $dist")

        if (grid[y][x] == -1) {
            return Int.MAX_VALUE
        }

        if (grid[y][x] == 0) {
            return dist
        }

        println("check x $x y $y dist $dist")

//        checkGrid[y][x] = true

        val nextDist = dist + 1
        return minOf(
            getClosest(x - 1, y, x, y, nextDist),
            getClosest(x + 1, y, x, y, nextDist),
            getClosest(x, y - 1, x, y, nextDist),
            getClosest(x, y + 1, x, y, nextDist)
        )
    }

    fun checkRooms(x: Int, y: Int, dist: Int) {
        if (x < 0 || y < 0 || x > grid[0].lastIndex || y > grid.lastIndex) {
            return
        }

        println("x $x y $y dist $dist")

        if (grid[y][x] == 0 || grid[y][x] == -1) {
            return
        }

        if (dist > grid[y][x] && checkGrid[y][x]) {
            return
        }

        grid[y][x] = min(grid[y][x], dist)

        println("check x $x y $y dist $dist")

        checkGrid[y][x] = true

        val nextDist = dist + 1
        checkRooms(x - 1, y, nextDist)
        checkRooms(x + 1, y, nextDist)
        checkRooms(x, y - 1, nextDist)
        checkRooms(x, y + 1, nextDist)
    }
}