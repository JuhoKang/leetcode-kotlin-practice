package problems.hard

fun main() {
    val medianOfTwoSortedArrays = MedianOfTwoSortedArrays()
    println(medianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)))
    println(medianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4)))
    println(medianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(0, 0), intArrayOf(0, 0)))
    println(medianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(), intArrayOf(1)))
    println(medianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(2), intArrayOf()))
}

/**
 * O(m+n) time complexity
 *
 * Follow up: The overall run time complexity should be O(log (m+n)).
 */
class MedianOfTwoSortedArrays {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var p1 = 0
        var p2 = 0

        val mergedArray = IntArray(nums1.size + nums2.size)

        for (i in 0..mergedArray.lastIndex) {
            when {
                p2 > nums2.lastIndex -> {
                    mergedArray[i] = nums1[p1]
                    p1++
                }
                p1 > nums1.lastIndex -> {
                    mergedArray[i] = nums2[p2]
                    p2++
                }
                nums1[p1] < nums2[p2] -> {
                    mergedArray[i] = nums1[p1]
                    p1++
                }
                else -> {
                    mergedArray[i] = nums2[p2]
                    p2++
                }
            }
        }

        //odd
        return if (mergedArray.size % 2 == 1) {
            mergedArray[mergedArray.size / 2].toDouble()
            //even
        } else {
            (mergedArray[mergedArray.size / 2 - 1] + mergedArray[mergedArray.size / 2]).toDouble() / 2
        }
    }
}