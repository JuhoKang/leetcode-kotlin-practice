package problems.easy

import common.TreeNode

fun main() {
    val t4 = TreeNode(4)
    val t2 = TreeNode(2)
    val t7 = TreeNode(7)
    val t1 = TreeNode(1)
    val t3 = TreeNode(3)
    val t6 = TreeNode(6)
    val t9 = TreeNode(9)

    t4.left = t2
    t4.right = t7
    t2.left = t1
    t2.right = t3
    t7.left = t6
    t7.right = t9

    val invertBinaryTree = InvertBinaryTree()

    invertBinaryTree.invertTree(t4)
}

/**
 * This problem was inspired by this original tweet by Max Howell:
 * Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
 */
class InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        val temp = root.right
        root.right = invertTree(root.left)
        root.left = invertTree(temp)

        println("val ${root.`val`} left ${root.left} right ${root.right} ")

        return root
    }
}