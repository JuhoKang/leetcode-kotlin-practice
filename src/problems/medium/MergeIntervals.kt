package problems.medium

import java.util.*

fun main() {
    val mergeIntervals = MergeIntervals()

    var merged =
        mergeIntervals.merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
    for (interval in merged) {
        println(interval.contentToString())
    }
    merged = mergeIntervals.merge(mergeIntervals.merge(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))))
    for (interval in merged) {
        println(interval.contentToString())
    }
}

/**
 * make a stack to merge.
 * push on left side of intervals. pop on right side of intervals
 * when the stack is empty get that is the interval
 */
class MergeIntervals {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
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

        val resultList = mutableListOf<IntArray>()

        for ((key, value) in map) {
            if (value.left > 0) {
                for (i in 0 until value.left) {
//                    println("push $key left")
                    stack.push(key)
                }
            }

            var popped = 0
            if (value.right > 0) {
                for (i in 0 until value.right) {
                    popped = stack.pop()
//                    println("pop $key right popped : $popped")
                }
            }

            if (stack.isEmpty()) {
                resultList.add(intArrayOf(popped, key))
            }
        }

//        println(resultList.size)
//        for(interval in resultList) {
//            println(interval.contentToString())
//        }

        return resultList.toTypedArray()
    }


    class IntervalNode(val left: Int = 0, val right: Int = 0)
}
