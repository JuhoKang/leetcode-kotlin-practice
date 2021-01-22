package problems.medium

import common.Node
import java.util.*

fun main() {
    val copyListWithRandomPointer = CopyListWithRandomPointer()

    val node0 = Node(7)
    val node1 = Node(13)
    val node2 = Node(11)
    val node3 = Node(10)
    val node4 = Node(1)

    node0.next = node1
    node0.random = null
    node1.next = node2
    node1.random = node0
    node2.next = node3
    node2.random = node4
    node3.next = node4
    node3.random = node2
    node4.next = null
    node4.random = node0

    var result = copyListWithRandomPointer.copyRandomList(node0)

//    while (result != null) {
//        println(result)
//        println("val : ${result.`val`} next:${result.next} random: ${result.random}")
//        result = result.next
//    }
}

class CopyListWithRandomPointer {
    fun copyRandomList(node: Node?): Node? {
        if (node == null) {
            return null
        }

        val nodeMap = TreeMap<Int, Node>()
        val nodeIndexMap = mutableMapOf<Node, Int>()

        nodeMap[0] = Node(node.`val`)

        var nodeIter = node
        var count = 0

        while (nodeIter != null) {
            nodeIndexMap[nodeIter] = count

            if (nodeIter.next != null) {
                nodeMap[count + 1] = Node(nodeIter.next!!.`val`)
                nodeMap[count]?.next = nodeMap[count + 1]
            }

            count++
            nodeIter = nodeIter.next
        }

        nodeIter = node
        count = 0

//        println(nodeMap)

        for ((key, node) in nodeMap) {
//            println(node)
//            println("node val : ${node.`val`}")
//            println("node.random: ${node.random}")
//            println("nodeIter?.random : ${nodeIter?.random}")
//            println("node?.next : ${node?.next}")
//            println("nodeIter?.next : ${nodeIter?.next}")

            if(nodeIter?.random != null) {
                val randomNode = nodeIter.random
                val ranIndex = nodeIndexMap[randomNode]
                node.random = nodeMap[ranIndex]
            }

            count++
            nodeIter = nodeIter?.next
        }

        return nodeMap[0]
    }
}