package com.igorwojda.integer.getodd

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun filterOdd(list: List<Int>): List<Int> {
    TODO("not implemented")
}

class GetOddNumbersTest {
    @Test
    fun `empty list returns empty list`() {
        filterOdd(listOf()) shouldEqual emptyList()
    }

    @Test
    fun `1, 2, 3 returns 1, 3`() {
        filterOdd(listOf(1, 2, 3)) shouldEqual listOf(1, 3)
    }

    @Test
    fun `2, 49, 2, 5, 4 returns 9, 5`() {
        filterOdd(listOf(2, 9, 2, 5, 4)) shouldEqual listOf(9, 5)
    }

    @Test
    fun `7, 4, 6, 8, 7, 9 returns 7, 7, 9`() {
        filterOdd(listOf(7, 4, 6, 8, 7, 9)) shouldEqual listOf(7, 7, 9)
    }
}
