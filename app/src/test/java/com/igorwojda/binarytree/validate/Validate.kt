package com.igorwojda.binarytree.validate

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

private fun isValidSearchBinaryTree(node: Node<Int>): Boolean {
    TODO("not implemented")
}

class IsValidSearchBinaryTreeTest {
    @Test
    fun `Validate recognizes a valid BST`() {
        // -- -------Tree------------
        //
        //           10
        //          /  \
        //         5    15
        //        /       \
        //       0         20
        // --------------------------

        val node = Node(10)
        node.insert(5)
        node.insert(15)
        node.insert(0)
        node.insert(20)

        isValidSearchBinaryTree(node) shouldBeEqualTo true
    }

    @Test
    fun `Validate recognizes an invalid BST`() {
        // -- -------Tree------------
        //
        //           10
        //          /  \
        //         5    15
        //        /       \
        //       0         20
        //        \
        //        999
        // --------------------------

        val node = Node(10)
        node.insert(5)
        node.insert(15)
        node.insert(0)
        node.insert(20)
        node.left?.left?.right = Node(999)

        isValidSearchBinaryTree(node) shouldBeEqualTo false
    }
}

private data class Node<E : Comparable<E>>(
    var data: E,
    var left: Node<E>? = null,
    var right: Node<E>? = null
) {
    fun insert(e: E) {
        if (e < data) { // left node
            if (left == null) {
                left = Node(e)
            } else {
                left?.insert(e)
            }
        } else if (e > data) { // right node
            if (right == null) {
                right = Node(e)
            } else {
                right?.insert(e)
            }
        }
    }
}
