package problems.easy

fun main() {
    val runningSumOf1dArray = RunningSumOf1dArray()
    println(runningSumOf1dArray.runningSum(intArrayOf(1, 2, 3, 4)).contentToString())
    println(runningSumOf1dArray.runningSum(intArrayOf(1, 1, 1, 1, 1)).contentToString())
    println(runningSumOf1dArray.runningSum(intArrayOf(3, 1, 2, 10, 1)).contentToString())
    println(runningSumOf1dArray.runningSum(intArrayOf()).contentToString())
}

class RunningSumOf1dArray {
    fun runningSum(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var runningSum = 0
        for (i in 0..nums.lastIndex) {
            runningSum += nums[i]
            result[i] = runningSum
        }

        return result
    }
}