package problems.medium

fun main() {
    val singleNumber3 = SingleNumber3()

    println(singleNumber3.singleNumber(intArrayOf(1, 2, 1, 3, 2, 5)).contentToString())
    println(singleNumber3.singleNumber(intArrayOf(-1, 0)).contentToString())
    println(singleNumber3.singleNumber(intArrayOf(0, 1)).contentToString())
}

class SingleNumber3 {
    fun singleNumber(nums: IntArray): IntArray {
        val set = mutableSetOf<Int>()

        for (num in nums) {
            if (set.contains(num)) {
                set.remove(num)
            } else {
                set.add(num)
            }
        }

        return set.toIntArray()
    }
}