package problems.medium

fun main() {
    val minimumOperationsToMakeArrayEqual = MinimumOperationsToMakeArrayEqual()

    println(minimumOperationsToMakeArrayEqual.minOperations(1))
    println(minimumOperationsToMakeArrayEqual.minOperations(3))
    println(minimumOperationsToMakeArrayEqual.minOperations(6))
}

class MinimumOperationsToMakeArrayEqual {
    fun minOperations(n: Int): Int {
        if (n == 1) {
            return 0
        }

        val target = if (n % 2 == 0) {
            val leftPos = n / 2 - 1
            val rightPos = n / 2

//            println("leftPos : $leftPos")
//            println("rightPos : $leftPos")
            ((2 * leftPos + 1) + (2 * rightPos + 1)) / 2
        } else {
            (2 * (n / 2) + 1)
        }

//        println("n : $n")
//        println("target : $target")

        var sum = 0

        for (i in 0 until n / 2) {
            sum += target - (2 * i + 1)
        }

        return sum
    }
}