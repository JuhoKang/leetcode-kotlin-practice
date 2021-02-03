package problems.medium

import java.util.*
import kotlin.collections.HashMap

fun main() {
    val topKFrequentWords = TopKFrequentWords()

    println(topKFrequentWords.topKFrequent(arrayOf("i", "love", "leetcode", "i", "love", "coding"), 2))
    println(
        topKFrequentWords.topKFrequent(
            arrayOf(
                "the",
                "day",
                "is",
                "sunny",
                "the",
                "the",
                "the",
                "sunny",
                "is",
                "is"
            ), 4
        )
    )
}

class TopKFrequentWords {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val wordFrequentMap = HashMap<String, Int>()

        for (word in words) {
            if (wordFrequentMap.containsKey(word)) {
                wordFrequentMap[word] = wordFrequentMap[word]!! + 1
            } else {
                wordFrequentMap[word] = 1
            }
        }

        val frequentWordMap = TreeMap<Int, MutableList<String>>()

        for ((key, value) in wordFrequentMap) {
            if (frequentWordMap.containsKey(value)) {
                frequentWordMap[value]!!.add(key)
            } else {
                frequentWordMap[value] = mutableListOf(key)
            }
        }

        var count = 0

        val resultList = mutableListOf<String>()

        for (key in frequentWordMap.descendingKeySet()) {
            frequentWordMap[key]!!.sort()

            for (word in frequentWordMap[key]!!) {
                resultList.add(word)
                count++

                if (count == k) {
                    break
                }
            }

            if (count == k) {
                break
            }
        }

        return resultList
    }
}