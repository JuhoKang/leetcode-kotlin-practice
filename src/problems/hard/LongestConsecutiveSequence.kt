package problems.hard

import kotlin.math.max

fun main() {
    val longestConsecutiveSequence = LongestConsecutiveSequence()

    println(longestConsecutiveSequence.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2)))
    println(longestConsecutiveSequence.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)))
}

class LongestConsecutiveSequence {

    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toHashSet()

        var resultMax = 0

        for (num in numSet) {
            if(!numSet.contains(num - 1)) {
                var temp = num
                var tempMax = 1

                while (numSet.contains(temp + 1)) {
                    temp++
                    tempMax++
                }

                resultMax = max(resultMax, tempMax)
            }
        }

        return resultMax
    }
}