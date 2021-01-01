package problems.easy

fun main() {
    val meetingRooms = MeetingRooms()

    println(meetingRooms.canAttendMeetings(arrayOf(intArrayOf(0, 30), intArrayOf(5, 10), intArrayOf(15, 20))))
    println(meetingRooms.canAttendMeetings(arrayOf(intArrayOf(6, 15), intArrayOf(13, 20), intArrayOf(6, 17))))
    println(meetingRooms.canAttendMeetings(arrayOf(intArrayOf(7, 10), intArrayOf(2, 4))))
    print(meetingRooms.canAttendMeetings(arrayOf(intArrayOf(13, 15), intArrayOf(1, 13))))
}

class MeetingRooms {
    fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
        if (intervals.isEmpty()) {
            return true
        }

        val sorted = intervals.sortedWith(compareBy({ it[0] }, { it[1] }))

        for (i in 1..sorted.lastIndex) {
            if (sorted[i][0] < sorted[i - 1][1]) {
                return false
            }
        }

        return true
    }
}