package com.igorwojda.list.sort.bubblesort

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun bubbleSort(list: List<Int>): List<Number> {
    return list
}

class BubbleSortTest {
    @Test
    fun `bubble sort 5, 1, 4, 2`() {
        bubbleSort(listOf(5, 1, 4, 2)) shouldEqual listOf(1, 2, 3, 4)
    }

    @Test
    fun `bubble sort 17, 4, 12, 19, 80, 75, 16`() {
        bubbleSort(listOf(17, 4, 12, 19, 80, 75, 16)) shouldEqual listOf(4, 12, 16, 17, 19, 75, 80)
    }
}
