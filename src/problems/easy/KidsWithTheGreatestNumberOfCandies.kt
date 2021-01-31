package problems.easy

fun main() {
    val kidsWithTheGreatestNumberOfCandies = KidsWithTheGreatestNumberOfCandies()

    println(kidsWithTheGreatestNumberOfCandies.kidsWithCandies(intArrayOf(2,3,5,1,3), 3).contentToString())
}

class KidsWithTheGreatestNumberOfCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
        val max = candies.maxOrNull()
        val resultArray = BooleanArray(candies.size)

        for (i in 0..candies.lastIndex) {
            resultArray[i] = candies[i] + extraCandies >= max!!
        }

        return  resultArray
    }
}