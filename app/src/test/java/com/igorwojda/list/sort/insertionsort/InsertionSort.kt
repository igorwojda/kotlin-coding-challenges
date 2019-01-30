package com.igorwojda.list.sort.insertionsort

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun insertionSort(list: MutableList<Int>): List<Int> {
    return emptyList()
}

class InsertionSortTest {
    @Test
    fun `insertion sort 5, 1, 4, 2`() {
        insertionSort(mutableListOf(5, 1, 4, 2)) shouldEqual listOf(1, 2, 4, 5)
    }

    @Test
    fun `insertion sort 17, 4, 12, 19, 80, 75, 16`() {
        insertionSort(mutableListOf(17, 4, 12, 19, 80, 75, 16)) shouldEqual listOf(4, 12, 16, 17, 19, 75, 80)
    }
}
