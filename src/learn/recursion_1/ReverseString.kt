package learn.recursion_1

fun main() {
    val reverseString = ReverseString()
    reverseString.reverseString(charArrayOf('h', 'e', 'l', 'l', 'o'))
    reverseString.reverseString(charArrayOf('H', 'a', 'n', 'n', 'a', 'h'))
}

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        helper(0, s.lastIndex, s)
    }

    private fun helper(left: Int, right: Int, s: CharArray) {
        if(left >= right) {
            return
        }
        val temp = s[left]
        s[left] = s[right]
        s[right] = temp
        helper(left+1, right-1, s)
    }
}