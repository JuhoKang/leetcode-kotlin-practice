package problems.easy

import java.util.*
import kotlin.math.min

fun main() {
    val highFive = HighFive()

    val result = highFive.highFive(
        arrayOf(
            intArrayOf(1, 91), intArrayOf(1, 92), intArrayOf(2, 93), intArrayOf(2, 97),
            intArrayOf(1, 60), intArrayOf(2, 77), intArrayOf(1, 65), intArrayOf(1, 87), intArrayOf(1, 100),
            intArrayOf(2, 100), intArrayOf(2, 76)
        )
    )

    for (student in result) {
        println("" + student[0] + ": " + student[1])
    }

}

class HighFive {
    fun highFive(items: Array<IntArray>): Array<IntArray> {
        val map = TreeMap<Int, Student>()
        for (item in items) {
            if (map.contains(item[0])) {
                map[item[0]]!!.addScore(item[1])
            } else {
                map[item[0]] = Student(mutableListOf())
                map[item[0]]!!.addScore(item[1])
            }
        }

        val result = Array(map.keys.size) {
            intArrayOf(0)
        }

        var count = 0

        for ((key, value) in map) {
            result[count] = intArrayOf(key, value.average())
            count++
        }

        return result
    }

    class Student(private val scores: MutableList<Int>) {
        private var min = Int.MAX_VALUE

        fun addScore(score: Int) {
//            println("min : $min")

            if (scores.size < 5) {
                scores.add(score)
                min = min(score, min)
            } else {
                if (score > min) {
                    scores.remove(min)
                    scores.add(score)
                    min = scores.minOrNull()!!
                }
            }
        }

        fun average(): Int {
            var sum = 0
            for (score in scores) {
                sum += score
            }

            return sum / 5
        }
    }
}