package problems.hard

import java.util.*

fun main() {
    val serializeAndDeserializeNaryTree = SerializeAndDeserializeNaryTree()

    val node1 = SerializeAndDeserializeNaryTree.Node(1)
    val node3 = SerializeAndDeserializeNaryTree.Node(3)
    val node2 = SerializeAndDeserializeNaryTree.Node(2)
    val node4 = SerializeAndDeserializeNaryTree.Node(4)
    val node5 = SerializeAndDeserializeNaryTree.Node(5)
    val node6 = SerializeAndDeserializeNaryTree.Node(6)

    node1.children = listOf(node3, node2, node4)
    node3.children = listOf(node5, node6)

    println(serializeAndDeserializeNaryTree.serialize(node1))
    val serialized = serializeAndDeserializeNaryTree.serialize(node1)
    val deSerialized = serializeAndDeserializeNaryTree.deserialize(serialized)
    println(serializeAndDeserializeNaryTree.serialize(deSerialized))

    val node44 = SerializeAndDeserializeNaryTree.Node(44)
    println(serializeAndDeserializeNaryTree.serialize(node44))
    val serialized2 = serializeAndDeserializeNaryTree.serialize(node44)
    val deSerialized2 = serializeAndDeserializeNaryTree.deserialize(serialized2)

    println(serializeAndDeserializeNaryTree.serialize(deSerialized2))
}

class SerializeAndDeserializeNaryTree {
    // Encodes a tree to a single string.
    fun serialize(root: Node?): String {
        if (root == null) {
            return ""
        }

        var result = "${root.`val`},"
        if (root.children.isNotEmpty()) {
            result += "(,"
            for (child in root.children) {
                result += serialize(child)
            }
            result += "),"
        }
        return result
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): Node? {
        if (data.isEmpty()) {
            return null
        }

        val dataList = data.split(",")

        if (dataList.size == 2) {
            return Node(dataList[0].toInt())
        }

        val result = Node(dataList[0].toInt())

        val dataListWithoutRoot = dataList.subList(2, dataList.lastIndex - 1)

        if (dataList[1] == "(") {
            result.children = innerDeserialize(dataListWithoutRoot)
        }

        return result
    }

    private fun innerDeserialize(data: List<String>): List<Node?> {
        val result = mutableListOf<Node>()
        val stack = Stack<Int>()

//        println(data)

        var inStack = false

        for (i in 0..data.lastIndex) {
            val char = data[i]

//            println(stack)

            if (char == "(") {
                inStack = true
                stack.push(i)
            } else if (char == ")") {
                val start = stack.pop()

                if (stack.isEmpty()) {
//                    println("lastval")
//                    println(result.last().`val`)
                    result.last().children = innerDeserialize(data.subList(start + 1, i))
                    inStack = false
                }
            } else {
                if(!inStack) {
                    result.add(Node(char.toInt()))
                }
            }
        }

//        println(result)

        return result
    }

    class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
    }
}