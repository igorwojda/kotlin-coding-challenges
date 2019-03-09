package com.igorwojda.tree.heap.maxbinaryheap

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class MaxBinaryHeap<E : Comparable<E>> {
    val items = mutableListOf<E>()

    fun add(element: E) {
        TODO("not implemented")
    }

    fun removeMax(): E? {
        TODO("not implemented")
    }

    private fun getParentIndex(index: Int): Int = TODO("not implemented")

    private fun getLeftChildIndex(index: Int): Int = TODO("not implemented")

    private fun getRightChildIndex(index: Int): Int = TODO("not implemented")

    fun isEmpty(): Boolean = TODO("not implemented")

    private fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }
}

class MaxBinaryHeapTest {
    @Test
    fun `build valid max binary heap`() {
        MaxBinaryHeap<Int>().apply {
            add(9)
            add(7)
            add(6)
            add(3)
            add(2)
            add(4)

            // ----------Heap------------
            //
            //           9
            //         /   \
            //        7     6
            //       / \   /
            //      3   2 4
            //
            // --------------------------

            items[0] shouldEqual 9
            items[1] shouldEqual 7
            items[2] shouldEqual 6
            items[3] shouldEqual 3
            items[4] shouldEqual 2
            items[5] shouldEqual 4
            items.size shouldEqual 6
        }
    }

    @Test
    fun `bubble-up added element one level up`() {
        MaxBinaryHeap<Int>().apply {
            add(9)
            add(7)
            add(6)
            add(3)
            add(2)
            add(4)

            // ----------Heap------------
            //
            //           9
            //         /   \
            //        7     6
            //       / \   /
            //      3   2 4
            //
            // --------------------------

            add(8) // and bubble it up

            // ----------Heap------------
            //
            //           9
            //         /   \
            //        7     8
            //       / \   / \
            //      3   2 4   6
            //
            // --------------------------

            items[0] shouldEqual 9
            items[1] shouldEqual 7
            items[2] shouldEqual 8
            items[3] shouldEqual 3
            items[4] shouldEqual 2
            items[5] shouldEqual 4
            items[6] shouldEqual 6
            items.size shouldEqual 7
        }
    }

    @Test
    fun `bubble-up added element to the root`() {
        MaxBinaryHeap<Int>().apply {
            add(9)
            add(7)
            add(6)
            add(3)
            add(2)
            add(4)

            // ----------Heap------------
            //
            //           9
            //         /   \
            //        7     6
            //       / \   /
            //      3   2 4
            //
            // --------------------------

            add(12) // and bubble it up

            // ----------Heap------------
            //
            //           12
            //         /    \
            //        7      9
            //       / \    / \
            //      3   2  4   6
            //
            // --------------------------

            items[0] shouldEqual 12
            items[1] shouldEqual 7
            items[2] shouldEqual 9
            items[3] shouldEqual 3
            items[4] shouldEqual 2
            items[5] shouldEqual 4
            items[6] shouldEqual 6
            items.size shouldEqual 7
        }
    }

    @Test
    fun `remove max element 9`() {
        MaxBinaryHeap<Int>().apply {
            add(9)
            add(7)
            add(6)
            add(3)
            add(2)
            add(4)

            // ----------Heap------------
            //
            //           9
            //         /   \
            //        7     6
            //       / \   /
            //      3   2 4
            //
            // --------------------------

            removeMax() shouldEqual 9

            // ----------Heap------------
            //
            //           7
            //         /   \
            //        4     6
            //       / \
            //      3   2
            //
            // --------------------------

            items[0] shouldEqual 7
            items[1] shouldEqual 4
            items[2] shouldEqual 6
            items[3] shouldEqual 3
            items[4] shouldEqual 2
            items.size shouldEqual 5
        }
    }

    @Test
    fun `remove max element 8`() {
        MaxBinaryHeap<Int>().apply {
            add(8)
            add(7)
            add(6)
            add(3)
            add(2)
            add(4)

            // ----------Heap------------
            //
            //           8
            //         /   \
            //        7     6
            //       / \   /
            //      3   2 4
            //
            // --------------------------

            removeMax() shouldEqual 8

            // ----------Heap------------
            //
            //           7
            //         /   \
            //        4     6
            //       / \
            //      3   2
            //
            // --------------------------

            items[0] shouldEqual 7
            items[1] shouldEqual 4
            items[2] shouldEqual 6
            items[3] shouldEqual 3
            items[4] shouldEqual 2
            items.size shouldEqual 5
        }
    }

    @Test
    fun `remove max element until heap is empty`() {
        MaxBinaryHeap<Int>().apply {
            add(8)
            add(7)
            add(6)

            // ----------Heap------------
            //
            //           8
            //         /   \
            //        7     6
            //
            // --------------------------

            removeMax() shouldEqual 8

            // ----------Heap------------
            //
            //           7
            //         /
            //        6
            //
            // --------------------------

            items[0] shouldEqual 7
            items[1] shouldEqual 6
            items.size shouldEqual 2

            removeMax() shouldEqual 7

            // ----------Heap------------
            //
            //           6
            //
            // --------------------------

            items[0] shouldEqual 6
            items.size shouldEqual 1

            removeMax() shouldEqual 6
            items.size shouldEqual 0
        }
    }
}
