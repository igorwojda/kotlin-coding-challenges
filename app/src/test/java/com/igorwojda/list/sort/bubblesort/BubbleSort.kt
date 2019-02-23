package com.igorwojda.list.sort.bubblesort

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun bubbleSort(list: List<Int>): List<Number> {
    TODO("not implemented")
}

class BubbleSortTest {
    @Test
    fun `bubble sort empty list`() {
        bubbleSort(mutableListOf()) shouldEqual listOf()
    }

    @Test
    fun `bubble sort 7`() {
        bubbleSort(mutableListOf(7)) shouldEqual listOf(7)
    }

    @Test
    fun `bubble sort empty list 9, 3`() {
        bubbleSort(mutableListOf(9, 3)) shouldEqual listOf(3, 9)
    }

    @Test
    fun `bubble sort 5, 1, 4, 2`() {
        bubbleSort(listOf(5, 1, 4, 2)) shouldEqual listOf(1, 2, 4, 5)
    }

    @Test
    fun `bubble sort 5, 2, 1, 8, 4, 7, 6, 3`() {
        bubbleSort(mutableListOf(5, 2, 1, 8, 4, 7, 6, 3)) shouldEqual listOf(1, 2, 3, 4, 5, 6, 7, 8)
    }

    @Test
    fun `bubble sort 17, 4, 12, 19, 80, 75, 16`() {
        bubbleSort(listOf(17, 4, 12, 19, 80, 75, 16)) shouldEqual listOf(4, 12, 16, 17, 19, 75, 80)
    }

    @Test
    fun `bubble sort 11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27`() {
        val list = mutableListOf(11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27)
        val sorted = mutableListOf(6, 10, 11, 19, 20, 20, 23, 27, 30, 32, 40, 40, 41, 42, 43, 50)

        bubbleSort(list) shouldEqual sorted
    }
}
