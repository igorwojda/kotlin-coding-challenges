package com.igorwojda.tree.classic.levelwidth

private object Solution1 {
    private fun levelWidth(tree: Node): List<Int> {
        val result = mutableListOf<Int>()

        val nodes = mutableListOf(tree)
        var levelCurrentNode = 0
        var levelTotalNodes = 1
        var nextLevelTotalNodes = 0

        while (nodes.isNotEmpty()) {
            val node = nodes.removeAt(0)
            levelCurrentNode++
            nodes.addAll(node.children)
            nextLevelTotalNodes += node.children.size

            if (levelCurrentNode == levelTotalNodes) {
                result.add(levelTotalNodes)
                levelCurrentNode = 0
                levelTotalNodes = nextLevelTotalNodes
                nextLevelTotalNodes = 0
            }
        }

        return result
    }

    private class Node(val data: String, val children: MutableList<Node> = mutableListOf()) {
        fun add(data: String) {
            add(Node(data))
        }

        fun add(node: Node) {
            children.add(node)
        }

        fun remove(data: String) {
            children.removeAll { it.data == data }
        }
    }
}

private object Solution2 {
    // Counters array solution
    private fun levelWidth(tree: Node): List<Int> {
        val rowSeparator = null
        val counters = mutableListOf<Int>()
        val nodes = mutableListOf<Node?>()
        nodes.add(tree)
        nodes.add(rowSeparator)
        counters.add(0)

        while (nodes.size >= 2) { // 2 means node and separator
            val node = nodes.removeAt(0)

            if (node == rowSeparator) { // end of row
                nodes.add(rowSeparator)
                counters.add(0)
            } else {
                nodes.addAll(node.children)
                counters[counters.lastIndex]++
            }
        }

        return counters
    }

    private class Node(val data: String, val children: MutableList<Node> = mutableListOf()) {
        fun add(data: String) {
            add(Node(data))
        }

        fun add(node: Node) {
            children.add(node)
        }

        fun remove(data: String) {
            children.removeAll { it.data == data }
        }
    }
}
