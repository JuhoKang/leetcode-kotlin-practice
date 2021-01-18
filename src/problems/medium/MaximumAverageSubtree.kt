package problems.medium

import common.TreeNode
import kotlin.math.max

fun main() {

    val maximumAverageSubtree = MaximumAverageSubtree()
    Int.MAX_VALUE
    val treeNode1 = TreeNode(5)
    val treeNode2 = TreeNode(6)
    val treeNode3 = TreeNode(1)
//    val treeNode4 = TreeNode(3)
//    val treeNode5 = TreeNode(5)
//    val treeNode6 = TreeNode(7)
    treeNode1.left = treeNode2
    treeNode1.right = treeNode3
//    treeNode2.left = treeNode4
//    treeNode4.left = treeNode5
//    treeNode4.right = treeNode6

    println(maximumAverageSubtree.maximumAverageSubtree(treeNode1))

}

class MaximumAverageSubtree {
    var maxAvg = 0.toDouble()

    fun maximumAverageSubtree(root: TreeNode?): Double {
        getTreeData(root)
        return maxAvg
    }

    private fun getTreeData(root: TreeNode?): TreeData {
        if (root == null) {
            return TreeData(0, 0)
        }

        val leftTreeData = getTreeData(root.left)
        val rightTreeData = getTreeData(root.right)

        val sum = leftTreeData.sum + rightTreeData.sum + root.`val`
        val nodeCount = 1 + leftTreeData.nodeCount + rightTreeData.nodeCount

        val average = sum.toDouble() / nodeCount

        maxAvg = max(average, maxAvg)

        return TreeData(sum, nodeCount)
    }

    data class TreeData(val sum: Int, val nodeCount: Int)
}