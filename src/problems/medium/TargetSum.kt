package problems.medium

fun main() {
    val targetSum = TargetSum()

    println(targetSum.findTargetSumWays(intArrayOf(1, 1, 1, 1, 1), 3))
    println(targetSum.findTargetSumWays(intArrayOf(1), 1))
    println(targetSum.findTargetSumWays(intArrayOf(1, 0), 1))
    println(targetSum.findTargetSumWays(intArrayOf(1), 1))
    println(targetSum.findTargetSumWays(intArrayOf(1, 2, 3, 4, 5), 9))
    println(targetSum.findTargetSumWays(intArrayOf(9, 7, 0, 3, 9, 8, 6, 5, 7, 6), 2))

    println(targetSum.findSums(intArrayOf(1, 1, 1, 2), 3))
    println(targetSum.findSums(intArrayOf(1, 0), 1))
    println(targetSum.findSums(intArrayOf(1), 1))
}

/**
 * sum 에서 S를 빼면 각 num에 2를 곱한 수의 합을 만드는 방법으로 문제를 바꿀 수 있다.
 * if you subtract S from sum
 * the problem changes to finding the sum of (2 * num) array
 * a b c d ==> S
 * a + b + c + d ==> sum
 * - a + b + c + d == sum - 2a
 */
class TargetSum {
    fun findTargetSumWays(nums: IntArray, S: Int): Int {
        val sum = nums.sum()

        val minusTarget = sum - S

        val nums2 = mutableListOf<Int>()

        val zeros = nums.filter {
            it == 0
        }.size

        for (num in nums) {
            if (num * 2 <= minusTarget) {
                nums2.add(num * 2)
            }
        }


//        println("zeros : $zeros")

        nums2.sortDescending()

//        println(nums2)
//        println(minusTarget)

        var sumResult = if (minusTarget == 0) {
            1
        } else if (minusTarget < 0) {
            0
        } else {
            findSums(nums2.toIntArray(), minusTarget)
        }

        for (i in 0 until zeros) {
            sumResult *= 2
        }

        return sumResult
    }

    fun findSums(nums: IntArray, target: Int): Int {
        var result = 0
        for (i in 0..nums.lastIndex) {
            if (nums[i] == target) {
                result++
            } else if (nums[i] < target) {
                result += findSums(nums.sliceArray(IntRange(i + 1, nums.lastIndex)), target - nums[i])
            }
        }
//        println(nums)
//        println(target)
//        println(result)

        return result
    }
}