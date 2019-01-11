package com.igorwojda.datastructure.list.bubblesort

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun selectionSort(list: List<Int>): List<Number> {
    return list
}

class BubbleSortTest {
    companion object {
        val LIST = listOf(5, 1, 4, 2, 8)
        val SORTED_LIST = listOf(1, 2, 4, 5, 8)
    }

    @Test
    fun `bubble sort test`() {
        selectionSort(LIST) shouldEqual SORTED_LIST
    }
}
