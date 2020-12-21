package problems.easy

fun main() {
    val twoSum = TwoSum()
    println(twoSum.twoSum(intArrayOf(0, 4, 3, 0), 0).contentToString())
}

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var sum: Int
        for (i in 0..nums.lastIndex) {
            for (j in (i+1)..nums.lastIndex) {
                sum = nums[i] + nums[j]
                if (sum == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf(1)
    }
}