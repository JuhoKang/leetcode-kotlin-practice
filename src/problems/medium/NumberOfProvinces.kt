package problems.medium

fun main() {
    val numberOfProvinces = NumberOfProvinces()

    println(numberOfProvinces.findCircleNum(arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 0), intArrayOf(0, 0, 1))))
    println(numberOfProvinces.findCircleNum(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 1))))
    println(numberOfProvinces.findCircleNum(arrayOf(intArrayOf(1,0,0,1), intArrayOf(0,1,1,0), intArrayOf(0,1,1,1), intArrayOf(1,0,1,1))))
}

//used union find (n^3)
class NumberOfProvinces {
    private var ref: MutableList<Int> = mutableListOf()
    private var components: Int = 0

    fun findCircleNum(isConnected: Array<IntArray>): Int {
        //ref = mutableListOf()

        val n = isConnected.size
        components = n

        for (i in 0 until n) {
            ref.add(i)
        }

        for ((index, connectInfo) in isConnected.withIndex()) {
//            if(ref[index] == index) {
                for (i in index + 1 until n) {
                    if(index != i && connectInfo[i] == 1) {
                        union(i, index)
                    }
                }
//            }
//            println(ref)
        }

        return components
    }

    private fun union(node: Int, toNode: Int) {
//        println("union $node : $toNode")
        val root1 = find(node)
        val root2 = find(toNode)

        if (root1 == root2) {
            return
        }

        ref[root1] = root2
        components--
    }

    private fun find(node: Int): Int {
        var root = node

        while (root != ref[root]) {
            root = ref[root]
        }

        var p = node

        while (p != root) {
            val next = ref[p]
            ref[p] = root
            p = next
        }

        return root
    }


}