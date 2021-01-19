package problems.medium

import common.TreeNode

fun main() {
    val smallestSubtreeWithAllTheDeepestNodes = SmallestSubtreeWithAllTheDeepestNodes()

    val treeNode3 = TreeNode(3)
    val treeNode5 = TreeNode(5)
    val treeNode1 = TreeNode(1)
    val treeNode6 = TreeNode(6)
    val treeNode2 = TreeNode(2)
    val treeNode7 = TreeNode(7)
    val treeNode4 = TreeNode(4)
    val treeNode0 = TreeNode(0)
    val treeNode8 = TreeNode(8)

    treeNode3.left = treeNode5
    treeNode3.right = treeNode1
    treeNode5.left = treeNode6
    treeNode5.right = treeNode2
    treeNode2.left = treeNode7
    treeNode2.right = treeNode4
    treeNode1.left = treeNode0
    treeNode1.right = treeNode8

    println(smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(treeNode3)?.`val`)

    val treeNode10 = TreeNode(10)
    val treeNode11 = TreeNode(11)
    val treeNode12 = TreeNode(12)
    val treeNode13 = TreeNode(13)
    val treeNode14 = TreeNode(14)
    val treeNode15 = TreeNode(15)

    treeNode10.left = treeNode11
    treeNode10.right = treeNode12
    treeNode11.right = treeNode13
    treeNode12.left = treeNode14
    treeNode12.right = treeNode15

    val smallestSubtreeWithAllTheDeepestNodes2 = SmallestSubtreeWithAllTheDeepestNodes()

    println(smallestSubtreeWithAllTheDeepestNodes2.subtreeWithAllDeepest(treeNode10)?.`val`)
}

class SmallestSubtreeWithAllTheDeepestNodes {
    var maxDepth = 0
    private var maxDepthNodes = mutableSetOf<TreeNode?>()
    private val rootMap = mutableMapOf<TreeNode, TreeNode>()

    fun subtreeWithAllDeepest(root: TreeNode?): TreeNode? {
        calcDeepest(root, 0)

        while (maxDepthNodes.size != 1) {
            maxDepthNodes = maxDepthNodes.map { rootMap[it] }.toMutableSet()
        }

        return maxDepthNodes.first()
    }

    private fun calcDeepest(root: TreeNode?, depth: Int) {
        if (root == null) {
            return
        }

        if (depth > maxDepth) {
            maxDepthNodes.clear()
            maxDepthNodes.add(root)
            maxDepth = depth
        } else if (depth == maxDepth) {
            maxDepthNodes.add(root)
        }

        if (root.left != null) {
            calcDeepest(root.left, depth + 1)
            rootMap[root.left!!] = root
        }

        if (root.right != null) {
            calcDeepest(root.right, depth + 1)
            rootMap[root.right!!] = root
        }
    }
}