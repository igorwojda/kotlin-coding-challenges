package com.igorwojda.list.binarysearch

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun binarySearch(list: List<Char>, element: Char): Int {
    fun getMiddle(left: Int, right: Int) = Math.floor((right + left).toDouble() / 2).toInt()

    var left = 0
    var right = list.lastIndex
    var middle = getMiddle(left, right)

    while (list[middle] != element && left <= right) {
        if (element < list[middle]) {
            right = middle - 1
        } else {
            left = middle + 1
        }

        middle = getMiddle(left, right)
    }

    return if (list[middle] == element) {
        middle
    } else {
        -1
    }
}

class BinarySearchTest {
    @Test
    fun `index of A in A, B, C is 0`() {
        binarySearch(listOf('A', 'B', 'C'), 'A') shouldEqual 0
    }

    @Test
    fun `index of B in A, B, C is 1`() {
        binarySearch(listOf('A', 'B', 'C'), 'B') shouldEqual 1
    }

    @Test
    fun `index of C in A, B, C is 2`() {
        binarySearch(listOf('A', 'B', 'C'), 'C') shouldEqual 2
    }

    @Test
    fun `index of H in A, B, C is -1`() {
        binarySearch(listOf('A', 'B', 'C'), 'H') shouldEqual -1
    }

    @Test
    fun `index of A in A, B, C, D is 0`() {
        binarySearch(listOf('A', 'B', 'C', 'D'), 'A') shouldEqual 0
    }

    @Test
    fun `index of B in A, B, C, D is 1`() {
        binarySearch(listOf('A', 'B', 'C', 'D'), 'B') shouldEqual 1
    }

    @Test
    fun `index of C in A, B, C, D is 2`() {
        binarySearch(listOf('A', 'B', 'C', 'D'), 'C') shouldEqual 2
    }

    @Test
    fun `index of D in A, B, C, D is 2`() {
        binarySearch(listOf('A', 'B', 'C', 'D'), 'D') shouldEqual 3
    }

    @Test
    fun `index of H in A, B, C, D is -1`() {
        binarySearch(listOf('A', 'B', 'C', 'D'), 'H') shouldEqual -1
    }
}
