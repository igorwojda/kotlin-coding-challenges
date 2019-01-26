package com.igorwojda.list.sort.insertionsort

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun insertionSort(list: List<Int>): List<Number> {
    return list
}

class InsertionSortTest {
    @Test
    fun `merge sort 5, 1, 4, 2`() {
        insertionSort(listOf(5, 1, 4, 2)) shouldEqual listOf(1, 2, 3, 4)
    }

    @Test
    fun `merge sort 17, 4, 12, 19, 80, 75, 16`() {
        insertionSort(listOf(17, 4, 12, 19, 80, 75, 16)) shouldEqual listOf(4, 12, 16, 17, 19, 75, 80)
    }
}
