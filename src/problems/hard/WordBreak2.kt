package problems.hard

fun main() {
    val wordBreak2 = WordBreak2()

    println(wordBreak2.wordBreak("catsanddog", listOf("cat", "cats", "and", "sand", "dog")))
    println(wordBreak2.wordBreak("pineapplepenapple", listOf("apple", "pen", "applepen", "pine", "pineapple")))
    println(wordBreak2.wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat")))
    println(
        wordBreak2.wordBreak(
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
            listOf("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")
        )
    )

//    println(
//        wordBreak2.wordBreak(
//            "aaaaaaaaaaaaaaa",
//            listOf("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")
//        )
//    )
}

class WordBreak2 {
    fun wordBreak(s: String, wordDict: List<String>): List<String> {
        var map = mutableMapOf<String, List<List<String>>>()

        val resultList = mutableListOf<String>()

        val charSet = mutableSetOf<Char>()

        for (word in wordDict) {
            if (s == word) {
                return listOf(word)
            }

            for (char in word) {
                charSet.add(char)
            }

            if (s.startsWith(word)) {
                map[word] = listOf(listOf(word))
            }
        }

        for (char in s) {
            if (!charSet.contains(char)) {
                return listOf()
            }
        }

        while (true) {
            val addMap = mutableMapOf<String, List<List<String>>>()

            for ((key, value) in map) {
//                println(comb)
                for (word in wordDict) {
                    if (s.startsWith(key + word)) {
                        if (s == key + word) {
                            for (items in value) {
                                resultList.add(listToStringWithSpace(items) + " $word")
                            }
                            continue
                        }

                        val combinations = mutableListOf<List<String>>()

                        for (items in value) {
                            combinations.add(items + listOf(word))
                        }

                        if (addMap[key + word] == null) {
                            addMap[key + word] = combinations
                        } else {
                            addMap[key + word] = addMap[key + word]!! + combinations
                        }
                    }
                }
//                println(set)
            }

            map = addMap

            if (addMap.isEmpty()) {
//                println("set is empty")
                break
            }
        }

        return resultList
    }

    private fun listToStringWithSpace(list: List<String>): String {
        var result = list[0]

        for (i in 1..list.lastIndex) {
            result += " ${list[i]}"
        }

        return result
    }
}