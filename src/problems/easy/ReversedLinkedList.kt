package problems.easy

import common.ListNode

fun main() {
    val reversedLinkedList = ReversedLinkedList()

    val listNode1 = ListNode(1)
    val listNode2 = ListNode(2)
    val listNode3 = ListNode(3)
    val listNode4 = ListNode(4)
    val listNode5 = ListNode(5)

    listNode1.next = listNode2
    listNode2.next = listNode3
    listNode3.next = listNode4
    listNode4.next = listNode5

    var result = reversedLinkedList.reverseList(listNode1)

    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}

class ReversedLinkedList {
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) {
            return null
        }

        var node = head
        val nodeMap = mutableMapOf<ListNode, ListNode>()

        var lastNode = ListNode(0)

        while (node != null) {
            if (node.next != null) {
                nodeMap[node.next!!] = node
                node = node.next
            } else {
                lastNode = node
                break
            }
        }

//        for((key, entry) in nodeMap) {
//            println("key : ${key.`val`} entry : ${entry.`val`}")
//        }

        var iterNode = lastNode

        while(nodeMap[iterNode] != null) {
            iterNode.next = nodeMap[iterNode]
            iterNode = iterNode.next!!
        }

        iterNode.next = null

        return lastNode
    }

    fun answer(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr = head
        while (curr != null) {
            val nextTemp = curr.next
            curr.next = prev
            prev = curr
            curr = nextTemp
        }
        return prev
    }
}