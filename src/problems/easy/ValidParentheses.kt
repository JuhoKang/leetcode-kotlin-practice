package problems.easy

import java.util.*

fun main() {
    val validParentheses = ValidParentheses()
    println(validParentheses.isValid("()"))
    println(validParentheses.isValid("()[]{}"))
    println(validParentheses.isValid("(]"))
    println(validParentheses.isValid("([)]"))
    println(validParentheses.isValid("{[]}"))
}

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (c in s.toCharArray()) {
            when (c) {
                '(', '{', '[' -> stack.push(c)
                ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') return false
                }
                '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') return false
                }
                ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') return false
                }
                else -> return false
            }
        }

        return stack.isEmpty()
    }
}