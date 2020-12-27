package problems.medium

fun main() {
    val generateParentheses = GenerateParentheses()
    println(generateParentheses.generateParenthesis(1))
    println(generateParentheses.generateParenthesis(2))
    println(generateParentheses.generateParenthesis(3))
//    println(generateParentheses.generateParenthesis(4))
}

//TODO
class GenerateParentheses {
    fun generateParenthesis(n: Int): List<String> {
        if (n == 1) {
            return mutableListOf("()")
        }

        var uniqueParenth = ""
        for (i in 1..n) {
            uniqueParenth += "("
        }
        for (i in 1..n) {
            uniqueParenth += ")"
        }

        val result = mutableListOf<String>(uniqueParenth)

        val combinations = getCombination(n)

//        println(combinations)

        for (comb in combinations) {
            val leftList = generateParenthesis(comb.first)
            val rightList = generateParenthesis(comb.second)

            for (l in leftList) {
                for (r in rightList) {
                    result.add(l + r)
                }
            }
        }

        return result
    }

    private fun getCombination(n: Int): List<Pair<Int, Int>> {
        val result = mutableListOf<Pair<Int, Int>>()
        for (i in 1 until n) {
            result.add(Pair(i, n - i))
        }
        return result
    }
}