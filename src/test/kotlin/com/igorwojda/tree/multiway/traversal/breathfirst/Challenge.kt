package com.igorwojda.tree.multiway.traversal.breathfirst

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun traverseBreathFirst(tree: BinarySearchTree<Char>): List<Char> {
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
    fun `traverse breath first`() {
        traverseBreathFirst(getTree()) shouldBeEqualTo listOf(
            'F',
            'B',
            'G',
            'A',
            'D',
            'I',
            'C',
            'E',
            'H',
        )
    }
}
