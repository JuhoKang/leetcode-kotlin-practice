package problems.medium

fun main() {
    val wordBreak = WordBreak()

    println(wordBreak.wordBreak("leetcode", listOf("leet", "code")))
    println(wordBreak.wordBreak("applepenapple", listOf("apple", "pen")))
    println(wordBreak.wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat")))
    println(wordBreak.wordBreak("a", listOf("a")))

}

class WordBreak {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        var set = mutableSetOf<String>()

        for (word in wordDict) {
            if(s == word) {
                return true
            }

            if (s.startsWith(word)) {
                set.add(word)
            }
        }

        while (true) {
            val addSet = mutableSetOf<String>()

            for (comb in set) {
//                println(comb)
                for (word in wordDict) {
                    if (s.startsWith(comb + word)) {
                        if (s == comb + word) {
                            return true
                        }
                        addSet.add(comb + word)
                    }
                }
//                println(set)
            }

            set = addSet

            if(set.isEmpty()) {
//                println("set is empty")
                break
            }
        }

        return false
    }
}