package problems.medium

import java.util.*

fun main() {
    val validateStackSequences = ValidateStackSequences()

    println(validateStackSequences.validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 5, 3, 2, 1)))
    println(validateStackSequences.validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 3, 5, 1, 2)))
}

class ValidateStackSequences {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        val stack = Stack<Int>()
        var pushedIndex = 0

        for (target in popped) {
            if (stack.contains(target)) {
                if (stack.pop() != target) {
                    return false
                }
            } else {
                while (pushed[pushedIndex] != target) {
                    stack.push(pushed[pushedIndex])
                    pushedIndex++
                }
                pushedIndex++
            }
        }

        return true
    }
}