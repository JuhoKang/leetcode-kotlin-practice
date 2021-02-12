package problems.easy

fun main() {
    val armstrongNumber = ArmstrongNumber()
    println(armstrongNumber.isArmstrong(153))
    println(armstrongNumber.isArmstrong(123))
}

class ArmstrongNumber {
    fun isArmstrong(N: Int): Boolean {
        val digit = N.toString().length

        var temp = N

        var sum = 0
        while (temp > 0) {
            sum += pow((temp % 10), digit).toInt()
            temp /= 10
        }

        return sum == N
    }

    private fun pow(a: Int, b: Int): Long {
        var result = 1L
        for (i in 1..b) {
            result *= a
        }

        return result
    }
}