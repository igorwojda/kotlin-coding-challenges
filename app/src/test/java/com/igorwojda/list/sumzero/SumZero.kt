package com.igorwojda.list.sumzero

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun sumZero(list: List<Int>): Pair<Int, Int>? {
    return null
}

class SumZeroTest {
    @Test
    fun `sumZero empty list should return null`() {
        sumZero(listOf()) shouldEqual null
    }

    @Test
    fun `sumZero 1,2 should return null`() {
        sumZero(listOf(1, 2)) shouldEqual null
    }

    @Test
    fun `sumZero 1,2, 4, 7 should return null`() {
        sumZero(listOf(1, 2, 4, 7)) shouldEqual null
    }

    @Test
    fun `sumZero -4, -3, -2, 1, 2, 3, 5 return Pair(-3, 3)`() {
        sumZero(listOf(-4, -3, -2, 1, 2, 3, 5)) shouldEqual Pair(-3, 3)
    }

    @Test
    fun `sumZero -4, -3, -2, 1, 2, 5 return Pair(-2, 2)`() {
        sumZero(listOf(-4, -3, -2, 1, 2, 5)) shouldEqual Pair(-2, 2)
    }
}
