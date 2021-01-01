package problems.medium

import java.util.*

fun main() {
    val meetingRooms2 = MeetingRooms2()

    println(meetingRooms2.minMeetingRooms(arrayOf(intArrayOf(0, 30), intArrayOf(5, 10), intArrayOf(15, 20))))
    println(meetingRooms2.minMeetingRooms(arrayOf(intArrayOf(6, 15), intArrayOf(13, 20), intArrayOf(6, 17))))
    println(meetingRooms2.minMeetingRooms(arrayOf(intArrayOf(7, 10), intArrayOf(2, 4))))
    print(meetingRooms2.minMeetingRooms(arrayOf(intArrayOf(13, 15), intArrayOf(1, 13))))

}

class MeetingRooms2 {
    fun minMeetingRooms(intervals: Array<IntArray>): Int {
        val map = TreeMap<Int, IntervalNode>()

        for (interval in intervals) {
            val leftPoint = map[interval[0]]
            if (leftPoint == null) {
                map[interval[0]] = IntervalNode(1, 0)
            } else {
                map[interval[0]] = IntervalNode(leftPoint.left + 1, leftPoint.right)
            }

            val rightPoint = map[interval[1]]
            if (rightPoint == null) {
                map[interval[1]] = IntervalNode(0, 1)
            } else {
                map[interval[1]] = IntervalNode(rightPoint.left, rightPoint.right + 1)
            }
        }

        val stack = Stack<Int>()

        var stackMax = 0

        for ((key, value) in map) {
            if (value.right > 0) {
                for (i in 0 until value.right) {
                    stackMax = if (stack.size > stackMax) {
                        stack.size
                    } else {
                        stackMax
                    }

                    stack.pop()
                }
            }

            if (value.left > 0) {
                for (i in 0 until value.left) {
                    stack.push(key)
                }
            }
        }
        return stackMax
    }

    class IntervalNode(val left: Int = 0, val right: Int = 0)
}
