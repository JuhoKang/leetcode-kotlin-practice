package problems.easy

import common.ListNode

fun main() {
    val mergeTwoSortedLists = MergeTwoSortedLists()
    val l1n1 = ListNode(1)
    val l1n2 = ListNode(2)
    val l1n3 = ListNode(4)
    l1n1.next = l1n2
    l1n2.next = l1n3

    val l2n1 = ListNode(1)
    val l2n2 = ListNode(3)
    val l2n3 = ListNode(4)
    l2n1.next = l2n2
    l2n2.next = l2n3

    var result = mergeTwoSortedLists.mergeTwoLists(l1n1, l2n1)

    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}

class MergeTwoSortedLists {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null && l2 == null) {
            return null
        }

        var left = l1
        var right = l2

        if (left == null) {
            return l2
        } else if (right == null) {
            return l1
        }

        val result: ListNode?

        if (left.`val` <= right.`val`) {
            result = left
            left = left.next
        } else {
            result = right
            right = right.next
        }

        var iter = result

        while (left != null || right != null) {
//            println(iter?.`val`)

            if (right == null) {
//                println("right null")
                iter?.next = left
                left = left?.next
            } else if (left == null) {
//                println("left null")
                iter?.next = right
                right = right.next
            } else if (left.`val` <= right.`val`) {
//                println("right bigger")
                iter?.next = left
                left = left.next
            } else {
//                println("left bigger")
                iter?.next = right
                right = right.next
            }
            iter = iter?.next
        }

        return result
    }

}