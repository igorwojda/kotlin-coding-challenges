package com.igorwojda.list.sort.radixsort

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun radixSort(list: List<Int>): List<Number> {
    return emptyList()
}

private fun Int.getDigitAt(index: Int): Char {
    return '0'
}

private val Int.digitCount get() = -1

private fun maxDigits(list: List<Int>): Int = -1

class RadixSortTest {
    @Test
    fun `getDigitAt at 0 for 123 is 1`() {
        123.getDigitAt(0) shouldEqual '3'
    }

    @Test
    fun `getDigitAt at 1 for 123 is 2`() {
        123.getDigitAt(1) shouldEqual '2'
    }

    @Test
    fun `getDigitAt at 2 for 123 is 3`() {
        123.getDigitAt(2) shouldEqual '1'
    }

    @Test
    fun `getDigitAt at 3 for 123 is 0`() {
        123.getDigitAt(3) shouldEqual '0'
    }

    @Test
    fun `getDigitAt at 7 for 123 is 0`() {
        123.getDigitAt(7) shouldEqual '0'
    }

    @Test
    fun `digitCount for 1 is 1`() {
        1.digitCount shouldEqual 1
    }

    @Test
    fun `digitCount for 123 is 3`() {
        123.digitCount shouldEqual 3
    }

    @Test
    fun `digitCount for 12345 is 5`() {
        12345.digitCount shouldEqual 5
    }

    @Test
    fun `maxDigits is equal to 0`() {
        maxDigits(listOf()) shouldEqual 0
    }

    @Test
    fun `maxDigits is equal to 1`() {
        maxDigits(listOf(1, 2, 4)) shouldEqual 1
    }

    @Test
    fun `maxDigits is equal to 2`() {
        maxDigits(listOf(1, 25, 42, 7, 9)) shouldEqual 2
    }

    @Test
    fun `maxDigits is equal to 5`() {
        maxDigits(listOf(1, 25, 42, 77898, 1)) shouldEqual 5
    }

    @Test
    fun `radix sort empty list`() {
        radixSort(mutableListOf()) shouldEqual listOf()
    }

    @Test
    fun `radix sort 5, 1, 4, 2`() {
        radixSort(mutableListOf(5, 1, 4, 2)) shouldEqual listOf(1, 2, 4, 5)
    }

    @Test
    fun `radix sort 51, 1, 24, 32, 74, 31`() {
        radixSort(mutableListOf(51, 1, 24, 32, 74, 31)) shouldEqual listOf(1, 24, 31, 32, 51, 74)
    }

    @Test
    fun `radix sort 11, 407, 211, 1250, 5678, 1204, 37, 44, 1054, 4979, 567, 71, 277, 2078, 721, 3179`() {
        val list = mutableListOf(11, 407, 211, 1250, 5678, 1204, 37, 44, 1054, 4979, 567, 71, 277, 2078, 721, 3179)
        val sorted = mutableListOf(11, 37, 44, 71, 211, 277, 407, 567, 721, 1054, 1204, 1250, 2078, 3179, 4979, 5678)

        radixSort(list) shouldEqual sorted
    }
}
