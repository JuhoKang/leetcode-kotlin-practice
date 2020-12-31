package learn.recursion_1

import common.ListNode

fun main() {
    val swapNodesInPairs = SwapNodesInPairs()
    val ln1 = ListNode(1)
    val ln2 = ListNode(2)
    val ln3 = ListNode(3)
    val ln4 = ListNode(4)
    ln1.next = ln2
    ln2.next = ln3
    ln3.next = ln4

    var result = swapNodesInPairs.swapPairs(ln1)
    while (result != null) {
        println(result.`val`)
        result = result.next
    }

    result = swapNodesInPairs.swapPairs(null)
    while (result != null) {
        println(result.`val`)
        result = result.next
    }

    val l2n1 = ListNode(1)
    result = swapNodesInPairs.swapPairs(l2n1)
    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}

class SwapNodesInPairs {
    fun swapPairs(head: ListNode?): ListNode? {
        if (head == null) {
            return head
        }

        if (head.next == null) {
            return head
        }

        val newLeft = head.next
        val newRight = head
        newRight.next = swapPairs(head.next?.next)
        newLeft?.next = newRight
        return newLeft
    }
}