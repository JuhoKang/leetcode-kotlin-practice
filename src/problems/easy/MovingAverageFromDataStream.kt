package problems.easy

import problems.easy.MovingAverageFromDataStream.MovingAverage
import kotlin.collections.ArrayDeque


fun main() {
    val movingAverage = MovingAverage(3)
    println(movingAverage.next(1)) // return 1.0 = 1 / 1

    println(movingAverage.next(10)) // return 5.5 = (1 + 10) / 2

    println(movingAverage.next(3)) // return 4.66667 = (1 + 10 + 3) / 3

    println(movingAverage.next(5)) // return 6.0 = (10 + 3 + 5) / 3
}

class MovingAverageFromDataStream {
    class MovingAverage(size: Int) {
        private val queue = ArrayDeque<Int>(size)
        private val size = size
        private var sum = 0

        /** Initialize your data structure here. */
        fun next(`val`: Int): Double {
            if (queue.size >= size) {
                sum -= queue.removeFirst()
            }

            sum += `val`
            queue.addLast(`val`)
            return sum.toDouble() / queue.size
        }

    }

    /**
     * Your MovingAverage object will be instantiated and called as such:
     * var obj = MovingAverage(size)
     * var param_1 = obj.next(`val`)
     */
}