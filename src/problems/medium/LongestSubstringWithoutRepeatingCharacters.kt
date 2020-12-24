package problems.medium

fun main() {
    val longest = LongestSubstringWithoutRepeatingCharacters()
    println(longest.lengthOfLongestSubstring("abcabcbb"))
    println(longest.lengthOfLongestSubstring("bbbbb"))
    println(longest.lengthOfLongestSubstring("pwwkew"))
    println(longest.lengthOfLongestSubstring(""))
    println(longest.lengthOfLongestSubstring("dvdf"))
    println(longest.lengthOfLongestSubstring("asjrgapa"))
}

/**
 * use sliding window
 */
class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        var currentMax = 0

        val charArray = s.toCharArray()

        var left = 0
        var right = 0

        val subCharDeque = ArrayDeque<Char>()

        while (left < s.length && right < s.length) {
//            println("left : ${left} right : ${right}")
            if (!subCharDeque.contains(charArray[right])) {
                subCharDeque.addLast(charArray[right])
                right++
            } else {
                subCharDeque.removeFirst()
                left++
            }

            currentMax = if (subCharDeque.size > currentMax) {
                subCharDeque.size
            } else {
                currentMax
            }

//            println(subCharDeque.toString())
        }

        return currentMax
    }
}