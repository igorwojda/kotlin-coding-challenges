package com.igorwojda.list.sort.mergesort

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun mergeSort(list: List<Int>): List<Int> {

    // Merge two sorted lists into one sorted list
    fun helper(left: List<Int>, right: List<Int>): MutableList<Int> {
        return mutableListOf()
    }

    return list
}

class MergeSortTest {
    @Test
    fun `merge sort 5, 1, 4, 2`() {
        mergeSort(listOf(5, 1, 4, 2)) shouldEqual listOf(1, 2, 4, 5)
    }

    @Test
    fun `merge sort 17, 4, 12, 19, 80, 75, 16`() {
        mergeSort(listOf(17, 4, 12, 19, 80, 75, 16)) shouldEqual listOf(4, 12, 16, 17, 19, 75, 80)
    }
}
