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
            while (i != indices[i]) {
                val tempChar = charArray[indices[i]]
                charArray[indices[i]] = charArray[i]
                charArray[i] = tempChar

                val tempIndex = indices[indices[i]]
                indices[indices[i]] = indices[i]
                indices[i] = tempIndex
            }
        }

        return String(charArray)
    }
}