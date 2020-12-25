package problems.easy

fun main() {
    val romanToInteger = RomanToInteger()
    println(romanToInteger.romanToInt("III"))
    println(romanToInteger.romanToInt("IV"))
    println(romanToInteger.romanToInt("IX"))
    println(romanToInteger.romanToInt("LVIII"))
    println(romanToInteger.romanToInt("MCMXCIV"))
}

class RomanToInteger {
    fun romanToInt(s: String): Int {
        val inputChars = s.toCharArray()

        var result = 0
        var beforeChar = 'Z'
        //iterate reverse order
        for (i in inputChars.lastIndex downTo 0) {
            if (inputChars[i] == 'I' && (beforeChar == 'V' || beforeChar == 'X')) {
                result -= singleRomanToInt(inputChars[i])
            } else if (inputChars[i] == 'X' && (beforeChar == 'L' || beforeChar == 'C')) {
                result -= singleRomanToInt(inputChars[i])
            } else if (inputChars[i] == 'C' && (beforeChar == 'D' || beforeChar == 'M')) {
                result -= singleRomanToInt(inputChars[i])
            } else {
                result += singleRomanToInt(inputChars[i])
            }
            beforeChar = inputChars[i]
        }
        return result
    }

    private fun singleRomanToInt(c: Char): Int {
        return when (c) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> {
                return 0
            }
        }
    }
}