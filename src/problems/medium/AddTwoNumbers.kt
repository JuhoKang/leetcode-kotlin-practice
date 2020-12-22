package problems.medium

import problems.easy.TwoSum

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

fun main() {
    val addTwoNumbers = AddTwoNumbers()
    val ln1 = ListNode(9)
    val ln2 = ListNode(9)
    val ln3 = ListNode(9)
    val ln4 = ListNode(9)
    val ln5 = ListNode(9)
    val ln6 = ListNode(9)
    val ln7 = ListNode(9)
    ln1.next = ln2
    ln2.next = ln3
    ln3.next = ln4
    ln4.next = ln5
    ln5.next = ln6
    ln6.next = ln7

    val l2n1 = ListNode(9)
    val l2n2 = ListNode(9)
    val l2n3 = ListNode(9)
    val l2n4 = ListNode(9)
    l2n1.next = l2n2
    l2n2.next = l2n3
    l2n3.next = l2n4

    var result = addTwoNumbers.addTwoNumbers(ln1, l2n1)

    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1Index = 0

        var iter1 = l1
        while (iter1 != null) {
            iter1 = iter1.next
            l1Index++
        }

        var l2Index = 0

        var iter2 = l2
        while (iter2 != null) {
            iter2 = iter2.next
            l2Index++
        }

        val maxIndex = if (l1Index > l2Index) {
            l1Index
        } else {
            l2Index
        }

        iter1 = l1
        iter2 = l2

        //println("maxIndex : $maxIndex")

        var adder = 0

        var nodePointer: ListNode? = null

        var listStart: ListNode? = null

        for (i in 0 until maxIndex) {
            val val1 = if (iter1?.`val` != null) {
                iter1.`val`
            } else {
                0
            }

            val val2 = if (iter2?.`val` != null) {
                iter2.`val`
            } else {
                0
            }

            println("val1 : $val1 val2 : $val2 adder : $adder")
            val sum = val1 + val2 + adder

            val node = ListNode(sum % 10)
            if (nodePointer != null) {
                nodePointer.next = node
            }
            nodePointer = node

            if (i == 0) {
                listStart = nodePointer
            }

            adder = if (sum / 10 > 0) 1 else 0

            iter1 = iter1?.next
            iter2 = iter2?.next
        }

        if(adder == 1) {
            nodePointer?.next = ListNode(1)
        }

        return listStart
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}