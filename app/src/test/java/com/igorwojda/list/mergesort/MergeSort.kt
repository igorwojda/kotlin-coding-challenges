package com.igorwojda.list.mergesort

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun mergeSort(list: List<Int>): List<Int> {
    return list
}

//Merge two sorted lists into one sorted list
private fun merge(left: List<Int>, right: List<Int>): MutableList<Int> {
    return mutableListOf()
}

class MergeSortTest {
    companion object {
        val LIST = listOf(5, 1, 4, 2)
        val SORTED_LIST = listOf(1, 2, 4, 5)
    }

    @Test
    fun `merge sort test`() {
        mergeSort(LIST) shouldEqual SORTED_LIST
    }
}
