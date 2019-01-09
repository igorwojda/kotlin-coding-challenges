package com.igorwojda.datastructure.tree.levelwidth

import org.amshove.kluent.shouldEqual
import org.junit.Test

// body of class or function that have to be implemented by solving problem
private fun levelWidth(tree: Node): List<Int> {
    val result = mutableListOf<Int>()

    return result
}


class LevelWidthTest {
    @Test fun `levelWidth returns number of nodes at widest point` () {
        val root = Node("A")
        val nodeB = Node("B")
        root.add(nodeB)
        root.add("C")
        val nodeD = Node("D")
        root.add(nodeD)
        nodeB.add("E")
        nodeD.add("F")

        levelWidth(root) shouldEqual listOf("1", "3", "2")
    }

    @Test fun `levelWidth returns number of nodes at widest point 2` () {
        val root = Node("A")
        val nodeB = Node("B")
        root.add(nodeB)
        val nodeC = Node("C")
        nodeB.add(nodeC)
        nodeB.add("D")
        nodeC.add("E")

        levelWidth(root) shouldEqual listOf(1, 1, 2, 1)
    }
}

private class Node(val data: String, val children:MutableList<Node> = mutableListOf()) {
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
        return emptyList()
    }

    fun traverseDF(): List<String> {
        return emptyList()
    }
}
