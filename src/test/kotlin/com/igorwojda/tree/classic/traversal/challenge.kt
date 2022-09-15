package com.igorwojda.tree.classic.traversal

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

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

    fun traverseBreathFirst(): List<E> {
        TODO("not implemented")
    }

    fun traverseDepthFirstPreOrder(): List<E> {
        TODO("not implemented")
    }

    fun traverseDepthFirstInOrder(): List<E> {
        TODO("not implemented")
    }

    fun traverseDepthFirstPostOrder(): List<E> {
        TODO("not implemented")
    }

    fun traverseDepthFirstPreOrderReversed(): List<E> {
        TODO("not implemented")
    }

    fun traverseDepthFirstInOrderReversed(): List<E> {
        TODO("not implemented")
    }

    fun traverseDepthFirstPostOrderReverse(): List<E> {
        TODO("not implemented")
    }
}

private data class BinaryNode<E : Comparable<E>>(
    val data: E,
    var left: BinaryNode<E>? = null,
    var right: BinaryNode<E>? = null
)

/*
We can use queue as helper class to implement breath first traversal. This is not most optimal queue implementation,
however it's enough for this task. Check "Queue challenge" solution for more details and more efficient queue
implementation.
*/
private class Queue<E> {
    private val list = mutableListOf<E>()

    fun add(element: E) {
        list.add(element)
    }

    fun remove() = if (list.isEmpty()) null else list.removeAt(0)

    fun peek() = list.firstOrNull()

    fun isEmpty() = list.isEmpty()

    fun isNotEmpty() = list.isNotEmpty()

    val size get() = list.size
}

private class Test {
    @Test
    fun `traverse breath first`() {
        getTree().traverseBreathFirst() shouldBeEqualTo listOf(
            'F',
            'B',
            'G',
            'A',
            'D',
            'I',
            'C',
            'E',
            'H'
        )
    }

    @Test
    fun `traverse depth first pre order`() {
        getTree().traverseDepthFirstPreOrder() shouldBeEqualTo listOf(
            'F',
            'B',
            'A',
            'D',
            'C',
            'E',
            'G',
            'I',
            'H'
        )
    }

    @Test
    fun `traverse depth first in order`() {
        getTree().traverseDepthFirstInOrder() shouldBeEqualTo listOf(
            'A',
            'B',
            'C',
            'D',
            'E',
            'F',
            'G',
            'H',
            'I'
        )
    }

    @Test
    fun `traverse depth first post order`() {
        getTree().traverseDepthFirstPostOrder() shouldBeEqualTo listOf(
            'A',
            'C',
            'E',
            'D',
            'B',
            'H',
            'I',
            'G',
            'F'
        )
    }

    @Test
    fun `traverse depth first pre order reversed`() {
        getTree().traverseDepthFirstPreOrderReversed() shouldBeEqualTo listOf(
            'F',
            'G',
            'I',
            'H',
            'B',
            'D',
            'E',
            'C',
            'A'
        )
    }

    @Test
    fun `traverse depth first in order reversed`() {
        getTree().traverseDepthFirstInOrderReversed() shouldBeEqualTo listOf(
            'I',
            'H',
            'G',
            'F',
            'E',
            'D',
            'C',
            'B',
            'A'
        )
    }

    @Test
    fun `traverse depth first post order reverse`() {
        getTree().traverseDepthFirstPostOrderReverse() shouldBeEqualTo listOf(
            'H',
            'I',
            'G',
            'E',
            'C',
            'D',
            'A',
            'B',
            'F'
        )
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
}
