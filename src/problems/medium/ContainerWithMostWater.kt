package problems.medium

fun main() {
    val containerWithMostWater = ContainerWithMostWater()
    println(containerWithMostWater.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    println(containerWithMostWater.maxArea(intArrayOf(1, 1)))
    println(containerWithMostWater.maxArea(intArrayOf(4, 3, 2, 1, 4)))
    println(containerWithMostWater.maxArea(intArrayOf(1, 2, 1)))
    println(containerWithMostWater.maxArea(intArrayOf(2,3,4,5,18,17,6)))
}

class ContainerWithMostWater {

    //Two Pointer
    fun maxArea(height: IntArray): Int {
        var max = 0

        var left = 0
        var right = height.lastIndex
        var smaller: Int
        var temp: Int
        while (left < right) {
            smaller = if (height[left] < height[right]) {
                height[left]
            } else {
                height[right]
            }

            temp = smaller * (right - left)

//            println("left: $left right: $right temp : $temp")

            max = if (temp > max) {
                temp
            } else {
                max
            }

            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }

        return max
    }


    fun maxAreaNSquared2(height: IntArray): Int {

        var max = 0
        var temp: Int

        for (i in height) {
            var left = -1
            var right = -1

            for (j in 0..height.lastIndex) {
                if (height[j] >= i) {
                    left = j
                    break
                }
            }

//            println("i : $i left: $left right: $right")
            for (j in height.lastIndex downTo 0) {
                if (height[j] >= i) {
                    right = j
                    break
                }
            }

//            println("i : $i left: $left right: $right")

            if (left == -1 || right == -1) {
                break
            }

            temp = i * (right - left)


//            println("i : $i left: $left right: $right temp : $temp")

            max = if (temp > max) {
                temp
            } else {
                max
            }
        }

        return max
    }

    //O(n^2)
    private fun maxAreaNSquared(height: IntArray): Int {

        var max = 0
        var smaller: Int
        var temp: Int
        for (i in 0..height.lastIndex) {
            for (j in i + 1..height.lastIndex) {
                smaller = if (height[i] < height[j]) {
                    height[i]
                } else {
                    height[j]
                }
                temp = smaller * (j - i)
                max = if (temp > max) {
                    temp
                } else {
                    max
                }
            }
        }

        return max
    }
}