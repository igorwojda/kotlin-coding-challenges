package com.igorwojda.datastructure.tree.basic

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class Tree {
    var root: Node? = null

    fun traverseBF(): List<String> {
        val result = mutableListOf<String>()

        return result
    }

    fun traverseDF(): List<String> {
        val result = mutableListOf<String>()

        return result
    }
}

private class Node(val data: String) {
    val children = mutableListOf<Node>()

    fun add(data: String) {
        children.add(Node(data))
    }

    fun remove(data: String) {
        children.removeAll { it.data == data }
    }
}

class TreeTest {
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
        val tree = Tree()
        tree.root = Node("a")
        tree.root?.add("b")
        tree.root?.add("c")
        tree.root?.children?.get(0)?.add("d")

        val result = tree.traverseBF()
        result shouldEqual listOf("a", "b", "c", "d")
    }

    @Test
    fun `depth first traverse`() {
        val tree = Tree()
        tree.root = Node("a")
        tree.root?.add("b")
        tree.root?.add("d")
        tree.root?.children?.get(0)?.add("c")

        val result = tree.traverseDF()

        result shouldEqual listOf("a", "b", "c", "d")
    }
}
