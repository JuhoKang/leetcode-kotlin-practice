package problems.medium

import java.util.*

fun main() {
    val minimumRemoveToMakeValidParentheses = MinimumRemoveToMakeValidParentheses()

    println(minimumRemoveToMakeValidParentheses.minRemoveToMakeValid("lee(t(c)o)de)"))
    println(minimumRemoveToMakeValidParentheses.minRemoveToMakeValid("a)b(c)d"))
    println(minimumRemoveToMakeValidParentheses.minRemoveToMakeValid("))(("))
    println(minimumRemoveToMakeValidParentheses.minRemoveToMakeValid("(a(b(c)d)"))
}

class MinimumRemoveToMakeValidParentheses {
    fun minRemoveToMakeValid(s: String): String {
        if (s.isEmpty()) {
            return ""
        }

        val chars = s.toCharArray()

        val stack = Stack<Int>()

        for (i in 0..s.lastIndex) {
            if (chars[i] == '(') {
                stack.push(i)
            } else if (chars[i] == ')') {
                if (stack.isEmpty()) {
                    chars[i] = ' '
                } else {
                    stack.pop()
                }
            }
        }

        for (i in stack) {
            chars[i] = ' '
        }

        return String(chars).filter {
            !it.isWhitespace()
        }
    }
}