package problems.easy

fun main() {
    val shuffleString = ShuffleString()

    println(shuffleString.restoreString("codeleet", intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)))
    println(shuffleString.restoreString("aaiourgt", intArrayOf(4, 0, 2, 6, 7, 3, 1, 5)))
}

class ShuffleString {
    fun restoreString(s: String, indices: IntArray): String {
        val charArray = s.toCharArray()

        for (i in 0..charArray.lastIndex) {
            val target = i
            while (target != indices[target]) {
                val tempChar = charArray[indices[target]]
                charArray[indices[target]] = charArray[target]
                charArray[target] = tempChar

                val tempIndex = indices[indices[target]]
                indices[indices[target]] = indices[target]
                indices[target] = tempIndex
            }
        }

        return String(charArray)
    }
}