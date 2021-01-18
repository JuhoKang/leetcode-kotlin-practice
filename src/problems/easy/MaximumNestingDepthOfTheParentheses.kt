package problems.easy

import java.util.*
import kotlin.math.max

fun main() {
    val maximumNestingDepthOfTheParentheses = MaximumNestingDepthOfTheParentheses()

    println(maximumNestingDepthOfTheParentheses.maxDepth("(1+(2*3)+((8)/4))+1"))
    println(maximumNestingDepthOfTheParentheses.maxDepth("(1)+((2))+(((3)))"))
    println(maximumNestingDepthOfTheParentheses.maxDepth("1+(2*3)/(2-1)"))
    println(maximumNestingDepthOfTheParentheses.maxDepth("1"))
}

class MaximumNestingDepthOfTheParentheses {
    fun maxDepth(s: String): Int {
        var max = 0

        val stack = Stack<Char>()

        for (char in s.toCharArray()) {
            when (char) {
                '(' -> {
                    stack.push('(')
                    max = max(stack.size, max)
                }
                ')' -> {
                    stack.pop()
                }
            }
        }

        return max
    }
}