package problems.medium.sawsolution

fun main() {
    val longestPalindromicSubstring = LongestPalindromicSubstring()
    println(longestPalindromicSubstring.longestPalindrome("babad"))
    println(longestPalindromicSubstring.longestPalindrome("cbbd"))
    println(longestPalindromicSubstring.longestPalindrome("a"))
    println(longestPalindromicSubstring.longestPalindrome("ac"))
    println(
        longestPalindromicSubstring.longestPalindrome(
            "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa"
        )
    )
    println(
        longestPalindromicSubstring.longestPalindrome(
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
        )
    )
}

//TODO
class LongestPalindromicSubstring() {
    fun longestPalindrome(s: String): String {
        return s
    }
}























////Solution in kotlin (Approach 4)
//class LongestPalindromicSubstring() {
//    fun longestPalindrome(s: String): String {
//        if (s.isEmpty()) {
//            return ""
//        }
//
//        var start = 0
//        var end = 0
//        for (i in 0..s.lastIndex) {
//            val length1 = expandAroundCenter(s, i, i);
//            val length2 = expandAroundCenter(s, i, i + 1);
//            var length = max(length1, length2)
//            if (length > end - start) {
//                start = i - (length - 1) / 2
//                end = i + length / 2
//            }
//        }
//
//        return s.substring(start, end + 1)
//    }
//
//    private fun expandAroundCenter(s: String, left: Int, right: Int): Int {
//        var l = left
//        var r = right
//
//        while (l >= 0 && r <= s.lastIndex && s[l] == s[r]) {
//            l--
//            r++
//        }
//
//        return r - l - 1
//    }
//}

////TimeLimit Exceed on last example
//class LongestPalindromicSubstring() {
//    private val palindromMap = mutableMapOf<String, Boolean>()
//    private var count = 0
//
//    fun longestPalindrome(s: String): String {
//        var longest = ""
//
//        if (s.isNotEmpty()) {
//            longest = s[0].toString()
//        }
//
//        for (i in 0..s.lastIndex) {
//            for (j in (i + 1)..s.lastIndex + 1) {
//                //stringlength is odd
//                if ((j - i + 1 > longest.length)) {
//                    val substring = s.substring(i, j)
//
////                    println(substring)
//                    if (isPalindrome(substring)) {
////                        println(substring)
//                        longest = if (substring.length > longest.length) {
//                            substring
//                        } else {
//                            longest
//                        }
//                    }
//                }
//            }
//        }
//        println(palindromMap)
//        println(count)
//        return longest
//    }
//
//    private fun isPalindrome(s: String): Boolean {
//        if (s.isEmpty() || s.length == 1) {
//            return true
//        }
//
//        if(palindromMap[s] == true) {
//            return true
//        } else if (palindromMap[s] == false) {
//            return false
//        }
//
//        count++
//
////      println(s[0] == s[s.lastIndex])
//        if (s[0] == s[s.lastIndex]) {
//            val substring = s.substring(1, s.lastIndex)
////            println(substring)
//            if (isPalindrome(substring)) {
//                palindromMap[s] = true
////                println(palindromMap)
//                return true
//            }
//            palindromMap[s] = false
//        }
//
//        return false
//    }
//}

