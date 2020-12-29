package problems.medium

fun main() {
    val letterCombinationsOfAPhoneNumber = LetterCombinationsOfAPhoneNumber()
    println(letterCombinationsOfAPhoneNumber.letterCombinations("23"))
    println(letterCombinationsOfAPhoneNumber.letterCombinations(""))
    println(letterCombinationsOfAPhoneNumber.letterCombinations("2"))
}

class LetterCombinationsOfAPhoneNumber {
    fun letterCombinations(digits: String): List<String> {
        if(digits.isEmpty()) {
            return mutableListOf()
        }

        val phoneMap = mapOf(
            '1' to charArrayOf(),
            '2' to charArrayOf('a', 'b', 'c'),
            '3' to charArrayOf('d', 'e', 'f'),
            '4' to charArrayOf('g', 'h', 'i'),
            '5' to charArrayOf('j', 'k', 'l'),
            '6' to charArrayOf('m', 'n', 'o'),
            '7' to charArrayOf('p', 'q', 'r', 's'),
            '8' to charArrayOf('t', 'u', 'v'),
            '9' to charArrayOf('w', 'x', 'y', 'z')
        )

        val counter = IntArray(digits.length)

        val lastCount = IntArray(digits.length)

        println(digits)

        for (i in 0..digits.lastIndex) {
            lastCount[i] = phoneMap[digits[i]]!!.lastIndex
        }

        val result = mutableListOf<String>()

        while (!(counter contentEquals lastCount)) {
            var s = ""
            for (i in 0..digits.lastIndex) {
                s += phoneMap[digits[i]]!![counter[i]]
            }
            result.add(s)

            //addcount
            counter[counter.lastIndex] += 1

            //println(lastCount.contentToString())

            for (i in counter.lastIndex downTo 0) {
                if (counter[i] > lastCount[i]) {
                    if (i - 1 >= 0) {
                        counter[i] = 0
                        counter[i - 1] += 1
                    }
                }
            }
        }

        var s = ""

        for (i in 0..digits.lastIndex) {
            s += phoneMap[digits[i]]!![lastCount[i]]
        }

        result.add(s)

        return result
    }
}