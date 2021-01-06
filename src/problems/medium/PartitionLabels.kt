package problems.medium

import kotlin.math.max

fun main() {
    val partitionLabels = PartitionLabels()

    println(partitionLabels.partitionLabels("ababcbacadefegdehijhklij"))
    println(partitionLabels.partitionLabels("ababcbacafhijhklij"))
    println(partitionLabels.partitionLabels("abc"))
}

class PartitionLabels {
    fun partitionLabels(S: String): List<Int> {
        val last = IntArray(26)

        for (i in 0..S.lastIndex) {
            last[S[i].toInt() - 'a'.toInt()] = i
        }

        println(last.contentToString())

        val result = mutableListOf<Int>()

        var left = 0
        var right = 0
        for (i in 0..S.lastIndex) {
            right = max(right, last[S[i].toInt() - 'a'.toInt()])
            if(i == right) {
                result.add(right - left + 1)
                left = right + 1
            }
        }

        return result
    }
}

// what I did
//class PartitionLabels {
//    fun partitionLabels(S: String): List<Int> {
//        val charList = S.toCharArray().toMutableList()
//        val soloPoints = mutableSetOf<Char>()
//
//        for (c in 'a'..'z') {
//            var min = -1
//            var max = -1
//            for (i in 0..charList.lastIndex) {
//                if (charList[i] == c) {
//                    if (min == -1) {
//                        min = i
//                        max = i
//                    } else {
//                        if (i > max) {
//                            max = i
//                            charList[i] = '0'
//                        }
//                    }
//                }
//            }
//
//            if (max != -1) {
//                charList[max] = c
//                if (min == max) {
//                    soloPoints.add(c)
//                }
//            }
//        }
//
//        val tempSet = mutableSetOf<Char>()
//        val pointList = mutableListOf<Int>()
//
//        for (i in 0..charList.lastIndex) {
//            val targetLetter = charList[i]
//
//            if (targetLetter != '0') {
//                if (soloPoints.contains(targetLetter)) {
//                    if (tempSet.isEmpty()) {
//                        pointList.add(i)
//                    }
//                } else {
//                    if (tempSet.contains(targetLetter)) {
//                        tempSet.remove(targetLetter)
//                    } else {
//                        tempSet.add(targetLetter)
//                    }
//
//                    if (tempSet.isEmpty()) {
//                        pointList.add(i)
//                    }
//                }
//            }
//        }
//
//        val result = mutableListOf<Int>()
//
//        for (i in 0..pointList.lastIndex) {
//            if (i == 0) {
//                result.add(pointList[i] + 1)
//            } else {
//                result.add(pointList[i] - pointList[i - 1])
//            }
//        }
//
//        return result
//    }
//}