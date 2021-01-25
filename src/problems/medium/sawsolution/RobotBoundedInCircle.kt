package problems.medium.sawsolution

import kotlin.math.abs

fun main() {
    val robotBoundedInCircle = RobotBoundedInCircle()

    println(robotBoundedInCircle.isRobotBounded("GGLLGG"))
    println(robotBoundedInCircle.isRobotBounded("GG"))
    println(robotBoundedInCircle.isRobotBounded("GL"))
    println(robotBoundedInCircle.isRobotBounded("GLGLGGLGL"))
    println(robotBoundedInCircle.isRobotBounded("GLRLLGLL"))

}

class RobotBoundedInCircle {
    fun isRobotBounded(instructions: String): Boolean {
        // north = 0, east = 1, south = 2, west = 3
        val directions = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(-1, 0))

        var x = 0
        var y = 0

        var idx = 0

        for (i in instructions.toCharArray()) {
            when (i) {
                'L' -> idx = (idx + 3) % 4
                'R' -> idx = (idx + 1) % 4
                else -> {
                    x += directions[idx][0]
                    y += directions[idx][1]
                }
            }
        }

        return x == 0 && y == 0 || idx != 0
    }
}