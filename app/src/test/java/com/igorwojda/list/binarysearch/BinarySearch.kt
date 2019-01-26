package com.igorwojda.list.binarysearch

import org.amshove.kluent.shouldEqual
import org.junit.Test


private fun binarySearch(list: List<Char>, element: Char): Int {
    var left = 0
    var right = list.size - 1

    while (left <= right) {
        val middle = (right + left) / 2

        println("L: $left (${list[left]}), M: $middle (${list[middle]}), R: $right (${list[right]})")
        // Check if x is present at mid
        if (list[middle] == element)
            return middle

        if (list[middle] < element)
            left = middle + 1 // x greater than middle, so ignore left half
        else
            right = middle - 1 // x greater than middle, so , ignore right half
    }

    // if we reach here, then element was
    // not present
    return -1
}

class BinarySearchTest {
    @Test
    fun `index of A in A, B, C is 0`() {
        binarySearch(
            listOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'O', 'P'),
            'C'
        ) shouldEqual 2
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
