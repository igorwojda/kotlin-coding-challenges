package com.igorwojda.tree.traversal

import org.amshove.kluent.shouldEqual
import org.junit.Test

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
        return emptyList()
    }

    fun traverseDF(): List<String> {
        return emptyList()
    }
}

class TreeTest {
    @Test
    fun `breath first traverse`() {
        tree.traverseBF() shouldEqual listOf("F", "B", "G", "A", "D", "I", "C", "E", "H")
    }

    @Test
    fun `depth first traverse`() {
        tree.traverseDF() shouldEqual listOf("F", "B", "A", "D", "C", "E", "G", "I", "H")
    }
}

// ---------Tree------------
//
//           F
//         /   \
//        B     G
//       / \     \
//      A   D     I
//         / \   /
//        C   E H
//
// --------------------------
private val tree: Node
    get() {
        // left branch
        val nodeD = Node("D").apply {
            add("C")
            add("E")
        }

        val nodeB = Node("B").apply {
            add("A")
            add(nodeD)
        }

        // right branch
        val nodeH = Node("H")
        val nodeI = Node("I").apply { add(nodeH) }
        val nodeG = Node("G").apply { add(nodeI) }

        // root node

        // tree
        return Node("F").apply {
            add(nodeB)
            add(nodeG)
        }
    }
