package com.igorwojda.list.sort.insertionsort

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun insertionSort(list: MutableList<Int>): List<Int> {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `insertion sort empty list`() {
        insertionSort(mutableListOf()) shouldBeEqualTo listOf()
    }

    @Test
    fun `insertion sort 7`() {
        insertionSort(mutableListOf(7)) shouldBeEqualTo listOf(7)
    }

    @Test
    fun `insertion sort empty list 9, 3`() {
        insertionSort(mutableListOf(9, 3)) shouldBeEqualTo listOf(3, 9)
    }

    @Test
    fun `insertion sort 5, 1, 4, 2`() {
        insertionSort(mutableListOf(5, 1, 4, 2)) shouldBeEqualTo listOf(1, 2, 4, 5)
    }

    @Test
    fun `insertion sort 5, 2, 1, 8, 4, 7, 6, 3`() {
        insertionSort(mutableListOf(5, 2, 1, 8, 4, 7, 6, 3)) shouldBeEqualTo listOf(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8
        )
    }

    @Test
    fun `insertion sort 17, 4, 12, 19, 80, 75, 16`() {
        insertionSort(mutableListOf(17, 4, 12, 19, 80, 75, 16)) shouldBeEqualTo listOf(
            4,
            12,
            16,
            17,
            19,
            75,
            80
        )
    }

    @Test
    fun `insertion sort 11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27`() {
        val list = mutableListOf(11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27)
        val sorted = mutableListOf(6, 10, 11, 19, 20, 20, 23, 27, 30, 32, 40, 40, 41, 42, 43, 50)

        insertionSort(list) shouldBeEqualTo sorted
    }
}
