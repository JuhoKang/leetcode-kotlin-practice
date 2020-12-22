package problems.easy

fun main() {
    val palindromeNumber = PalindromeNumber()
    println(palindromeNumber.isPalindrome(121))
    println(palindromeNumber.isPalindrome(-121))
    println(palindromeNumber.isPalindrome(10))
    println(palindromeNumber.isPalindrome(-101))
    println(palindromeNumber.isPalindrome(0))
}

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if(x < 0) {
            return false
        }

        if(x == 0) {
            return true
        }

        var num = x

        val digits = mutableListOf<Int>()

        while (num > 0) {
            digits.add(num % 10)
            num /= 10
        }

        for (i in 0..digits.lastIndex / 2) {
            if(digits[i] != digits[digits.lastIndex - i]) {
                return false
            }
        }

        return true
    }
}