package problems.medium

fun main() {
    val stringToInteger = StringToInteger()
    println(stringToInteger.myAtoi("+42"))
    println(stringToInteger.myAtoi("   -42"))
    println(stringToInteger.myAtoi("4193 with words"))
    println(stringToInteger.myAtoi("words and 987"))
    println(stringToInteger.myAtoi("-91283472332"))
    println(stringToInteger.myAtoi("42"))
    println(stringToInteger.myAtoi(""))
    println(stringToInteger.myAtoi("00000-42a1234"))
    println(stringToInteger.myAtoi("  0000000000012345678"))
    println(stringToInteger.myAtoi("3.143"))
    println(stringToInteger.myAtoi("3.143ab"))
    println(stringToInteger.myAtoi("    0000000000000   "))
    println(stringToInteger.myAtoi("  -0012a42"))
    println(stringToInteger.myAtoi("2147483648"))
    println(stringToInteger.myAtoi("-6147483648"))
    println(stringToInteger.myAtoi("010"))
}


//TIP : next time don't use power. result *= 10 should do the trick
class StringToInteger {
    fun myAtoi(s: String): Int {
        val inputChars = s.trimStart().toCharArray()

        s.toInt()
        val start: Int
        var minus = false

        if (inputChars.isEmpty()) {
            return 0
        }

//        println(inputChars.contentToString())

        when {
            inputChars[0] in '0'..'9' -> {
                start = 0
            }
            inputChars[0] == '-' -> {
                minus = true
                start = 1
            }
            inputChars[0] == '+' -> {
                start = 1
            }
            else -> {
                return 0
            }
        }

        val ilist = mutableListOf<Int>()

        for (i in start..inputChars.lastIndex) {
            val digit = ctoi(inputChars[i])

//            println("digit : $digit")
            if (digit == 10) break
            ilist.add(digit)
        }

        if (ilist.isEmpty()) return 0

        while (ilist.isNotEmpty() && ilist[0] == 0) {
            ilist.remove(0)
        }

        if (ilist.isEmpty()) return 0

        var result = 0
        var added: Int
        for (i in 0..ilist.lastIndex) {
            try {
                added = ilist[i] * pow(10, ilist.lastIndex - i)
                if (i != ilist.lastIndex && added % 10 != 0) {
                    return if (minus) {
                        Int.MIN_VALUE
                    } else {
                        Int.MAX_VALUE
                    }
                }
                result += added
            } catch (e: IllegalStateException) {
                return if (minus) {
                    Int.MIN_VALUE
                } else {
                    Int.MAX_VALUE
                }
            }

            if (i != 0 && result <= 0) {
                return if (minus) {
                    Int.MIN_VALUE
                } else {
                    Int.MAX_VALUE
                }
            }
        }

//        println(result)

        return if (minus) {
            result * -1
        } else {
            result
        }
    }

    private fun ctoi(c: Char): Int {
        return when (c) {
            '0' -> 0
            '1' -> 1
            '2' -> 2
            '3' -> 3
            '4' -> 4
            '5' -> 5
            '6' -> 6
            '7' -> 7
            '8' -> 8
            '9' -> 9
            else -> 10
        }
    }

    private fun pow(a: Int, b: Int): Int {
//       println("a : $a b: $b")

        var result = 1
        for (i in 1..b) {
            result *= a
        }

//        println("pow : result : $result")
        if (result <= 0 || (b != 0 && result % 10 != 0)) throw IllegalStateException()

        return result
    }
}