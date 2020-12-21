package problems.easy

fun main() {
    val reverseInteger = ReverseInteger()
    println(reverseInteger.reverse(123))
    println(reverseInteger.reverse(-123))
    println(reverseInteger.reverse(120))
    println(reverseInteger.reverse(0))
}

class ReverseInteger {
    fun reverse(x: Int): Int {
        val digits = mutableListOf<Int>()

        var num = if (x < 0) {
            -x
        } else {
            x
        }

        while (num > 0) {
            digits.add(num % 10)
            num /= 10
        }

        println(digits.toString())

        var reversed = 0L
        val iterator = digits.asReversed().iterator()

        for ((i, v) in iterator.withIndex()) {
            reversed += v * (pow(10, i))
        }

        if (reversed > Int.MAX_VALUE) {
            return 0
        }

        return if (x < 0) {
            -reversed.toInt()
        } else {
            reversed.toInt()
        }
    }

    private fun pow(a: Int, b: Int): Long {
        var result = 1L
        for (i in 1..b) {
            result *= a
        }

        return result
    }
}