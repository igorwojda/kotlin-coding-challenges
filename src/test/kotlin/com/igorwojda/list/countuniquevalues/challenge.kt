package com.igorwojda.list.countuniquevalues

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun countUniqueValues(list: List<Int>): Int {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `countUniqueValues empty list return 0`() {
        countUniqueValues(listOf()) shouldBeEqualTo 0
    }

    @Test
    fun `countUniqueValues 4 return 1`() {
        countUniqueValues(listOf(4)) shouldBeEqualTo 1
    }

    @Test
    fun `countUniqueValues 3, 3, 3, 3, 5 return 2`() {
        countUniqueValues(listOf(3, 3, 3, 3, 5)) shouldBeEqualTo 2
    }

    @Test
    fun `countUniqueValues 5, 5, 6, 7, 7 returns 3`() {
        countUniqueValues(listOf(5, 5, 6, 7, 7)) shouldBeEqualTo 3
    }

    @Test
    fun `countUniqueValues 1, 5, 9, 9 returns 3`() {
        countUniqueValues(listOf(1, 5, 9, 9)) shouldBeEqualTo 3
    }

    @Test
    fun `countUniqueValues 1, 5, 5, 5, 9 returns 3`() {
        countUniqueValues(listOf(1, 5, 5, 5, 9)) shouldBeEqualTo 3
    }

    @Test
    fun `countUniqueValues 4, 4, 5, 7, 10, 10 returns 4`() {
        countUniqueValues(listOf(4, 4, 5, 7, 10, 10)) shouldBeEqualTo 4
    }

    @Test
    fun `countUniqueValues 2, 2, 3, 6, 7, 9, 9, 12, 13, 13 returns 7`() {
        countUniqueValues(listOf(2, 2, 3, 6, 7, 9, 9, 12, 13, 13)) shouldBeEqualTo 7
    }

    @Test
    fun `countUniqueValues 1, 2, 3, 4, 5 return 5`() {
        countUniqueValues(listOf(1, 2, 3, 4, 5)) shouldBeEqualTo 5
    }

    @Test
    fun `countUniqueValues 2, 3, 4, 7 return 4`() {
        countUniqueValues(listOf(2, 3, 4, 7)) shouldBeEqualTo 4
    }
}
