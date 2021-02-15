package problems.medium

fun main() {
    val findRootOfNAryTree = FindRootOfNAryTree()

    val node1 = FindRootOfNAryTree.Node(1)
    val node3 = FindRootOfNAryTree.Node(3)
    val node2 = FindRootOfNAryTree.Node(2)
    val node4 = FindRootOfNAryTree.Node(4)
    val node5 = FindRootOfNAryTree.Node(5)
    val node6 = FindRootOfNAryTree.Node(6)

    node1.children = listOf(node3, node2, node4)
    node3.children = listOf(node5, node6)

    println(findRootOfNAryTree.findRoot(listOf(node1, node2, node3, node4, node5, node6)))
}

class FindRootOfNAryTree {

    fun findRoot(tree: List<Node>): Node? {
        val childRootMap = mutableMapOf<Node, Node?>()

        for (node in tree) {
            node.children.forEach {
                childRootMap[it!!] = node
            }

            if(childRootMap[node] == null) {
                childRootMap[node] = null
            }
        }

//        childRootMap.forEach {
//            println("child ${it.value} root ${it.key}")
//        }

        var result: Node? = null
        childRootMap.forEach {
            if(it.value == null) {
                result = it.key
            }
        }

        return result
    }

    class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
    }
}