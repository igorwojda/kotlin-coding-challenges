package com.igorwojda.datastructure.tree.basic

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class Tree {
    var root: Node? = null

    fun traverseBF(): List<String> {
        val result = mutableListOf<String>()
        val nodes = mutableListOf<Node>()

        root?.let { nodes.add(it) }

        while(nodes.isNotEmpty()) {
            val node = nodes.removeAt(0)
            result.add(node.data)
            nodes.addAll(node.children)
        }

        return result
    }

    fun traverseDF(): List<String> {
        val result = mutableListOf<String>()
        val nodes = mutableListOf<Node>()

        root?.let { nodes.add(it) }

        while(nodes.isNotEmpty()) {
            val node = nodes.removeAt(0)

            result.add(node.data)
            nodes.addAll(0, node.children)
        }

        return result
    }
}

private class Node(val data: String) {
    val children = mutableListOf<Node>()

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

class TreeTest {
    private val tree: Tree
        get() {
            //left branch
            val nodeD = Node("D").apply {
                add("C")
                add("E")
            }

            val nodeB = Node("B").apply {
                add("A")
                add(nodeD)
            }

            //right branch
            val nodeH = Node("H")
            val nodeI = Node("I").apply { add(nodeH) }
            val nodeG = Node("G").apply { add(nodeI) }

            //root node
            val nodeF = Node("F").apply {
                add(nodeB)
                add(nodeG)
            }

            //tree
            val tree = Tree()
            tree.root = nodeF
            return tree
        }

    @Test
    fun `create Node with abc data`() {
        val n = Node("abc")
        n.data shouldEqual "abc"
        n.children.size shouldEqual 0
    }

    @Test
    fun `Node can add children`() {
        val n = Node("a")
        n.add("b")
        n.children.size shouldEqual 1
        n.children[0].children shouldEqual emptyList()
    }

    @Test
    fun `Node can remove children`() {
        val n = Node("a")
        n.add("b")
        n.children.size shouldEqual 1
        n.remove("b")
        n.children.size shouldEqual 0
    }

    @Test
    fun `Tree is empty`() {
        val t = Tree()
        t.root shouldEqual null
    }

    @Test
    fun `breath first traverse`() {
        tree.traverseBF() shouldEqual listOf("F", "B", "G", "A", "D", "I", "C", "E", "H")
    }

    @Test
    fun `depth first traverse`() {
        tree.traverseDF() shouldEqual listOf("F", "B", "A", "D", "C", "E", "G", "I", "H")
    }
}

