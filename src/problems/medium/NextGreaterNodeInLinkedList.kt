package problems.medium

import common.ListNode

fun main() {
    val nextGreaterNodeInLinkedList = NextGreaterNodeInLinkedList()

//    val node0 = ListNode(1)
//    val node1 = ListNode(7)
//    val node2 = ListNode(5)
//    val node3 = ListNode(1)
//    val node4 = ListNode(9)
//    val node5 = ListNode(2)
//    val node6 = ListNode(5)
//    val node7 = ListNode(1)
//
//    node0.next = node1
//    node1.next = node2
//    node2.next = node3
//    node3.next = node4
//    node4.next = node5
//    node5.next = node6
//    node6.next = node7
//
//    println(nextGreaterNodeInLinkedList.nextLargerNodes(node0).contentToString())

    val node0 = ListNode(9)
    val node1 = ListNode(7)
    val node2 = ListNode(6)
    val node3 = ListNode(7)
    val node4 = ListNode(6)
    val node5 = ListNode(9)

    node0.next = node1
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5

    println(nextGreaterNodeInLinkedList.nextLargerNodes(node0).contentToString())

    val nodee0 = ListNode(2)
    val nodee1 = ListNode(7)
    val nodee2 = ListNode(4)
    val nodee3 = ListNode(3)
    val nodee4 = ListNode(5)

    nodee0.next = nodee1
    nodee1.next = nodee2
    nodee2.next = nodee3
    nodee3.next = nodee4

    println(nextGreaterNodeInLinkedList.nextLargerNodes(nodee0).contentToString())
}

class NextGreaterNodeInLinkedList {
//    fun nextLargerNodes(head: ListNode?): IntArray {
//        if (head == null) {
//            return intArrayOf()
//        }
//
//        var iter = head
//
//        val resultList = mutableListOf<Int>()
//
//        while (iter != null) {
//            val nextMaxVal = iter.`val`
//
//            var subIter = iter.next
//
//            while (subIter != null) {
//                if (subIter.`val` > nextMaxVal) {
//                    resultList.add(subIter.`val`)
//                    break
//                }
//                subIter = subIter.next
//            }
//
//            if (subIter == null) {
//                resultList.add(0)
//            }
//
//            iter = iter.next
//        }
//
//        return resultList.toIntArray()
//    }

    fun nextLargerNodes(head: ListNode?): IntArray {
        if (head == null) {
            return intArrayOf()
        }

        var iter = head

        val baseList = mutableListOf<Int>()

        while (iter != null) {
            baseList.add(iter.`val`)
            iter = iter.next
        }

        val resultList = mutableListOf<Int>()

        for (i in 0..baseList.lastIndex) {
            var nextBigger = baseList[i]

            for(j in i+1..baseList.lastIndex) {
                if(baseList[j] > nextBigger) {
                    nextBigger = baseList[j]
                    resultList.add(baseList[j])
                    break
                }
            }

            if(nextBigger == baseList[i]) {
                resultList.add(0)
            }
        }

        return resultList.toIntArray()
    }
}