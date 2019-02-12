package com.igorwojda.list.countuniquevalues

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun countUniqueValues(list: List<Int>): Int {
    return 0
}

class CountUniqueValuesTest {
    @Test
    fun `countUniqueValues empty list return 0`() {
        countUniqueValues(listOf()) shouldEqual 0
    }

    @Test
    fun `countUniqueValues 4 return 1`() {
        countUniqueValues(listOf(4)) shouldEqual 1
    }

    @Test
    fun `countUniqueValues 3, 3, 3, 3, 5 return 2`() {
        countUniqueValues(listOf(3, 3, 3, 3, 5)) shouldEqual 2
    }

    @Test
    fun `countUniqueValues 2, 3, 4, 7 return 4`() {
        countUniqueValues(listOf(2, 3, 4, 7)) shouldEqual 4
    }

    @Test
    fun `countUniqueValues 5, 5, 6, 7 returns 3`() {
        countUniqueValues(listOf(5, 5, 6, 7)) shouldEqual 3
    }
}
