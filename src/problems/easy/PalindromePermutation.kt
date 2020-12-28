package problems.easy

fun main() {
    val palindromePermutation = PalindromePermutation()
    println(palindromePermutation.canPermutePalindrome("code"))
    println(palindromePermutation.canPermutePalindrome("aab"))
    println(palindromePermutation.canPermutePalindrome("carerac"))
}

class PalindromePermutation {
    fun canPermutePalindrome(s: String): Boolean {
        val charMap = mutableMapOf<Char, Int>()

        for (c in s.toCharArray()) {
            if (charMap[c] == null) {
                charMap[c] = 1
            } else {
                charMap[c] = charMap[c]!! + 1
            }
        }

        var oddCount = 0

        for (c in charMap) {
            if (c.value % 2 == 1) {
                oddCount++
            }

            if (oddCount > 1) {
                return false
            }
        }

        return true
    }
}