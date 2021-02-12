package problems.easy

fun main() {
    val checkIfTwoStringArraysAreEquivalent = CheckIfTwoStringArraysAreEquivalent()

    println(checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(arrayOf("ab", "c"), arrayOf("a", "bc")))
    println(checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(arrayOf("a", "cb"), arrayOf("ab", "c")))
    println(checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(arrayOf("abc", "d", "defg"), arrayOf("abcddefg")))
    println(checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(arrayOf("abc", "d", "defg"), arrayOf("abcddef")))
}

class CheckIfTwoStringArraysAreEquivalent {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        var arrayCount1 = 0
        var arrayCount2 = 0

        var count1 = 0
        var count2 = 0

        while (arrayCount1 != word1.size && arrayCount2 != word2.size) {
//            println("1 ac $arrayCount1 c $count1 / 2 ac $arrayCount2 c $count2")
//            println("${word1[arrayCount1][count1]} / ${word2[arrayCount2][count2]}")

            if (word1[arrayCount1][count1] != word2[arrayCount2][count2]) {
                return false
            }

            if (count1 == word1[arrayCount1].lastIndex) {
                count1 = 0
                arrayCount1 += 1
            } else {
                count1++
            }

            if (count2 == word2[arrayCount2].lastIndex) {
                count2 = 0
                arrayCount2 += 1
            } else {
                count2++
            }
        }

        //check if both arrived at the end
        return arrayCount1 == word1.size && arrayCount2 == word2.size
    }
}