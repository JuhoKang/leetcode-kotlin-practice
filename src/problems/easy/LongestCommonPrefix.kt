package problems.easy

fun main() {
    val longestCommonPrefix = LongestCommonPrefix()
    println(longestCommonPrefix.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix.longestCommonPrefix(arrayOf("dog","racecar","car")))
}

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) {
            return ""
        }

        var commonPrefix = ""

        for(i in 1..strs[0].length) {
            val substr = strs[0].take(i)
            for(j in 1..strs.lastIndex) {
                if(substr != strs[j].take(i)) {
                    return commonPrefix
                }
            }
            commonPrefix = substr
        }

        return commonPrefix
    }
}