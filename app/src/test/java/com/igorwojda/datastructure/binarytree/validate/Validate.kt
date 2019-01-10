package com.igorwojda.datastructure.binarytree.validate

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun validate(node: Node<Int>, min: Int? = null, max: Int? = null): Boolean {
    return false
}

class PuzzleTest {
    @Test
    fun `Validate recognizes a valid BST`() {
        val node = Node(10)
        node.insert(5)
        node.insert(15)
        node.insert(0)
        node.insert(20)

        validate(node) shouldEqual true
    }

    @Test
    fun `Validate recognizes an invalid BST`() {
        val node = Node(10)
        node.insert(5)
        node.insert(15)
        node.insert(0)
        node.insert(20)
        node.left?.left?.right = Node(999)

        validate(node) shouldEqual false
    }
}

private data class Node<E : Comparable<E>>(
    var data: E,
    var left: Node<E>? = null,
    var right: Node<E>? = null
) {
    fun insert(e: E) {
        if (e < data) { //left node
            if (left == null) {
                left = Node(e)
            } else {
                left?.insert(e)
            }
        } else if (e > data) { //right node
            if (right == null) {
                right = Node(e)
            } else {
                right?.insert(e)
            }
        }
    }
}
