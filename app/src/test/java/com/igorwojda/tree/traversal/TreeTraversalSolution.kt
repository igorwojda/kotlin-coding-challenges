package com.igorwojda.tree.traversal

private object TreeTraversalSolution {
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

        fun traverseBF(): List<String> {
            val result = mutableListOf<String>()
            val nodes = mutableListOf<Node>()

            nodes.add(this)

            while (nodes.isNotEmpty()) {
                val node = nodes.removeAt(0)
                result.add(node.data)
                nodes.addAll(node.children)
            }

            return result
        }

        fun traverseDF(): List<String> {
            val result = mutableListOf<String>()
            val nodes = mutableListOf<Node>()

            nodes.add(this)

            while (nodes.isNotEmpty()) {
                val node = nodes.removeAt(0)

                result.add(node.data)
                nodes.addAll(0, node.children)
            }

            return result
        }
    }
}
