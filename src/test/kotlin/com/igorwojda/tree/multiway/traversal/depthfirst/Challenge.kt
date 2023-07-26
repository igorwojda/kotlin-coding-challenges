package com.igorwojda.tree.multiway.traversal.depthfirst

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun traverseDepthFirstPreOrder(binaryTree: BinarySearchTree<Char>): List<Char> {
    TODO("Add your solution here")
}

private fun traverseDepthFirstInOrder(binaryTree: BinarySearchTree<Char>): List<Char> {
    TODO("Add your solution here")
}

private fun traverseDepthFirstPostOrder(binaryTree: BinarySearchTree<Char>): List<Char> {
    TODO("Add your solution here")
}

private fun traverseDepthFirstPreOrderReversed(binaryTree: BinarySearchTree<Char>): List<Char> {
    TODO("Add your solution here")
}

private fun traverseDepthFirstInOrderReversed(binaryTree: BinarySearchTree<Char>): List<Char> {
    TODO("Add your solution here")
}

private fun traverseDepthFirstPostOrderReversed(binaryTree: BinarySearchTree<Char>): List<Char> {
    TODO("Add your solution here")
}

private class BinarySearchTree<E : Comparable<E>> {
    var root: BinaryNode<E>? = null
        private set

    fun add(element: E) {
        val newNode = BinaryNode(element)

        if (root == null) {
            root = newNode
            return
        }

        var current: BinaryNode<E> = root ?: return

        while (true) {
            when {
                current.data == element -> {
                    return
                }

                element < current.data -> {
                    if (current.left == null) {
                        current.left = newNode
                        return
                    }

                    current.left?.let { current = it }
                }

                element > current.data -> {
                    if (current.right == null) {
                        current.right = newNode
                        return
                    }

                    current.right?.let { current = it }
                }
            }
        }
    }

    fun contains(element: E): Boolean {
        var current = root

        while (true) {
            if (current == null) {
                break
            } else if (current.data == element) {
                return true
            } else if (element < current.data) {
                current = current.left
            } else if (element > current.data) {
                current = current.right
            }
        }

        return false
    }

    fun isEmpty() = root == null
}

private data class BinaryNode<E : Comparable<E>>(
    val data: E,
    var left: BinaryNode<E>? = null,
    var right: BinaryNode<E>? = null,
)

private class Stack<E> {
    private val list = mutableListOf<E>()

    val size get() = list.size

    fun add(element: E) {
        list.add(element)
    }

    fun remove() = if (list.isEmpty()) null else list.removeAt(list.lastIndex)

    fun peek() = list.lastOrNull()

    fun isEmpty() = list.isEmpty()

    fun isNotEmpty() = list.isNotEmpty()
}

private class Test {
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
    private fun getTree() = BinarySearchTree<Char>().apply {
        add('F')
        add('B')
        add('A')
        add('D')
        add('C')
        add('E')
        add('G')
        add('I')
        add('H')
    }

    @Test
    fun `traverse depth first pre order`() {
        traverseDepthFirstPreOrder(getTree()) shouldBeEqualTo listOf(
            'F',
            'B',
            'A',
            'D',
            'C',
            'E',
            'G',
            'I',
            'H',
        )
    }

    @Test
    fun `traverse depth first in order`() {
        traverseDepthFirstInOrder(getTree()) shouldBeEqualTo listOf(
            'A',
            'B',
            'C',
            'D',
            'E',
            'F',
            'G',
            'H',
            'I',
        )
    }

    @Test
    fun `traverse depth first post order`() {
        traverseDepthFirstPostOrder(getTree()) shouldBeEqualTo listOf(
            'A',
            'C',
            'E',
            'D',
            'B',
            'H',
            'I',
            'G',
            'F',
        )
    }

    @Test
    fun `traverse depth first pre order reversed`() {
        traverseDepthFirstPreOrderReversed(getTree()) shouldBeEqualTo listOf(
            'F',
            'G',
            'I',
            'H',
            'B',
            'D',
            'E',
            'C',
            'A',
        )
    }

    @Test
    fun `traverse depth first in order reversed`() {
        traverseDepthFirstInOrderReversed(getTree()) shouldBeEqualTo listOf(
            'I',
            'H',
            'G',
            'F',
            'E',
            'D',
            'C',
            'B',
            'A',
        )
    }

    @Test
    fun `traverse depth first post order reverse`() {
        traverseDepthFirstPostOrderReversed(getTree()) shouldBeEqualTo listOf(
            'H',
            'I',
            'G',
            'E',
            'C',
            'D',
            'A',
            'B',
            'F',
        )
    }
}
