package problems.easy

fun main() {
    val moveZeros = MoveZeros()

    val nums = intArrayOf(0, 1, 0, 3, 12)
    moveZeros.moveZeroes(nums)
    println(nums.contentToString())

    val nums2 = intArrayOf(1, 0, 1, 0 , 1, 1, 1, 0, 3, 12, 0)
    moveZeros.moveZeroes(nums2)
    println(nums2.contentToString())
}

class MoveZeros {
    fun moveZeroes(nums: IntArray): Unit {
        var zeroPointer = 0
        var targetPointer = 0

//        println(nums.contentToString())
//        println("zeroPointer $zeroPointer targetPointer $targetPointer")

        while (zeroPointer != nums.lastIndex + 1) {
            if(nums[zeroPointer] == 0) {
                targetPointer++
            } else {
                zeroPointer++
            }

            if(targetPointer > nums.lastIndex) {
                break
            }

            if(zeroPointer < targetPointer && nums[targetPointer] != 0) {
                nums[zeroPointer] = nums[targetPointer]
                nums[targetPointer] = 0
            }

//            println(nums.contentToString())
//            println("zeroPointer $zeroPointer targetPointer $targetPointer")
        }

    }
}