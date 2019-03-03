package com.igorwojda.tree.binarysearchtree

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class BinarySearchTree<E : Comparable<E>> {
    var root: BinaryNode<E>? = null
        private set

    fun add(element: E) {
        TODO("not implemented")
    }

    fun contains(element: E): Boolean {
        TODO("not implemented")
    }

    fun isEmpty(): Boolean {
        TODO("not implemented")
    }
}

private data class BinaryNode<E : Comparable<E>>(
    val data: E,
    var left: BinaryNode<E>? = null,
    var right: BinaryNode<E>? = null
)

class BinarySearchTreeTest {
    @Test
    fun `build valid binary search tree`() {
        // ----------Tree------------
        //
        //           6
        //         /   \
        //        3     8
        //       / \   / \
        //      1   5 7   9
        //
        // --------------------------

        BinarySearchTree<Int>().apply {
            add(6)
            add(3)
            add(8)
            add(5)
            add(7)
            add(1)
            add(9)

            root?.data shouldEqual 6
            root?.left?.data shouldEqual 3
            root?.left?.left?.data shouldEqual 1
            root?.left?.right?.data shouldEqual 5
            root?.right?.data shouldEqual 8
            root?.right?.left?.data shouldEqual 7
            root?.right?.right?.data shouldEqual 9
        }
    }

    @Test
    fun `tree contains all elements`() {
        // ----------Tree------------
        //
        //           6
        //         /   \
        //        3     8
        //       / \   / \
        //      1   5 7   9
        //
        // --------------------------

        BinarySearchTree<Int>().apply {
            add(6)
            add(3)
            add(8)
            add(5)
            add(7)
            add(1)
            add(9)

            contains(6) shouldEqual true
            contains(3) shouldEqual true
            contains(8) shouldEqual true
            contains(5) shouldEqual true
            contains(7) shouldEqual true
            contains(1) shouldEqual true
            contains(9) shouldEqual true
            contains(100) shouldEqual false
        }
    }
}
