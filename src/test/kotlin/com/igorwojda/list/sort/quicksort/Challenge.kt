package com.igorwojda.list.sort.quicksort

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun quickSort(list: MutableList<Int>, left: Int = 0, right: Int = list.lastIndex): List<Number> {
    TODO("not implemented")
}

private fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

private class Test {
    @Test
    fun `quick sort empty list`() {
        quickSort(mutableListOf()) shouldBeEqualTo listOf()
    }

    @Test
    fun `quick sort 7`() {
        quickSort(mutableListOf(7)) shouldBeEqualTo listOf(7)
    }

    @Test
    fun `quick sort empty list 9, 3`() {
        quickSort(mutableListOf(9, 3)) shouldBeEqualTo listOf(3, 9)
    }

    @Test
    fun `quick sort 5, 1, 4, 2`() {
        quickSort(mutableListOf(5, 1, 4, 2)) shouldBeEqualTo listOf(1, 2, 4, 5)
    }

    @Test
    fun `quick sort 5, 2, 1, 8, 4, 7, 6, 3`() {
        quickSort(mutableListOf(5, 2, 1, 8, 4, 7, 6, 3)) shouldBeEqualTo listOf(
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
    fun `quick sort 17, 4, 12, 19, 80, 75, 16`() {
        quickSort(mutableListOf(17, 4, 12, 19, 80, 75, 16)) shouldBeEqualTo listOf(
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
    fun `quick sort 11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27`() {
        val list = mutableListOf(11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27)
        val sorted = mutableListOf(6, 10, 11, 19, 20, 20, 23, 27, 30, 32, 40, 40, 41, 42, 43, 50)

        quickSort(list) shouldBeEqualTo sorted
    }
}
