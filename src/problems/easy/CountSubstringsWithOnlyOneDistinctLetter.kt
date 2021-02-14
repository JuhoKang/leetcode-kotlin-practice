package problems.easy

fun main() {
    val countSubstringsWithOnlyOneDistinctLetter = CountSubstringsWithOnlyOneDistinctLetter()

    println(countSubstringsWithOnlyOneDistinctLetter.countLetters("aaaba"))
    println(countSubstringsWithOnlyOneDistinctLetter.countLetters("aaaaaaaaaa"))
}

class CountSubstringsWithOnlyOneDistinctLetter {
    fun countLetters(S: String): Int {
        var slength = 0
        var curChar = '*'
        var result = 0

        for (char in S.toCharArray()) {
            if (char != curChar) {
                result += getCount(slength)
                slength = 1
                curChar = char
            } else {
                slength++
            }
        }

        result += getCount(slength)

        return result
    }

    private fun getCount(slength: Int): Int {
        if (slength == 0 || slength == 1) {
            return slength
        }

        var sum = 0

        for (i in slength downTo 1) {
            sum += i
        }

//        println("sum $sum")

        return sum
    }
}