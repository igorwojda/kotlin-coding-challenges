package com.igorwojda.list.sort.mergesort

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun mergeSort(list: List<Int>): List<Int> {
    // Take two sorted lists and merge them together into one sorted list
    fun merge(left: MutableList<Int>, right: MutableList<Int>): MutableList<Int> {
        val result = mutableListOf<Int>()
        return result
    }

    return emptyList()
}

class MergeSortTest {
    @Test
    fun `merge sort empty list`() {
        mergeSort(mutableListOf()) shouldEqual listOf()
    }

    @Test
    fun `merge sort 5, 1, 4, 2`() {
        mergeSort(mutableListOf(5, 1, 4, 2)) shouldEqual listOf(1, 2, 4, 5)
    }

    @Test
    fun `merge sort 5, 2, 1, 8, 4, 7, 6, 3`() {
        mergeSort(mutableListOf(5, 2, 1, 8, 4, 7, 6, 3)) shouldEqual listOf(1, 2, 3, 4, 5, 6, 7, 8)
    }

    @Test
    fun `merge sort 17, 4, 12, 19, 80, 75, 16`() {
        mergeSort(mutableListOf(17, 4, 12, 19, 80, 75, 16)) shouldEqual listOf(4, 12, 16, 17, 19, 75, 80)
    }

    @Test
    fun `merge sort 11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27`() {
        val list = mutableListOf(11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27)
        val sorted = mutableListOf(6, 10, 11, 19, 20, 20, 23, 27, 30, 32, 40, 40, 41, 42, 43, 50)

        mergeSort(list) shouldEqual sorted
    }
}
