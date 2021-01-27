package problems.medium

fun main() {
    val kthLargestElementInAnArray = KthLargestElementInAnArray()

    println(kthLargestElementInAnArray.findKthLargest(intArrayOf(3,2,1,5,6,4), 2))
    println(kthLargestElementInAnArray.findKthLargest(intArrayOf(3,2,3,1,2,4,5,5,6), 4))
}

/**
 * TODO KEYWORD Quick Select (no need to sort)
 */
class KthLargestElementInAnArray {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        nums.sortDescending()

        return nums[k - 1]
    }
}