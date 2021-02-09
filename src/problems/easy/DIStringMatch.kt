package problems.easy

fun main() {
    val diStringMatch = DIStringMatch()
    println(diStringMatch.diStringMatch("IDID").contentToString())
    println(diStringMatch.diStringMatch("III").contentToString())
    println(diStringMatch.diStringMatch("DDI").contentToString())
}

class DIStringMatch {
    fun diStringMatch(S: String): IntArray {
        var left = 0
        var right = S.length
        val result = IntArray(S.length + 1)

        for ((index, char) in S.toCharArray().withIndex()) {
            when (char) {
                'I' -> {
                    result[index] = left
                    left++
                }
                else -> {
                    result[index] = right
                    right--
                }
            }
        }
        result[result.lastIndex] = left

        return result
    }
}