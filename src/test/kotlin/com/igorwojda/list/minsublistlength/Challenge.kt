package com.igorwojda.list.minsublistlength

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

fun minSubListLength(list: List<Int>, sum: Int): Int {
    TODO("not implemented")
}

private fun min(i1: Int?, i2: Int?): Int? {
    return when {
        i1 != null && i2 != null -> Math.min(i1, i2)
        i1 != null && i2 == null -> i1
        i1 == null && i2 != null -> i2
        else -> null
    }
}

private class Test {
    @Test
    fun `min sub list sum empty list and 7 returns 0`() {
        minSubListLength(listOf(), 7) shouldBeEqualTo 0
    }

    @Test
    fun `min sub list sum 1,3,4 and 5 returns 2`() {
        minSubListLength(listOf(1, 3, 4), 5) shouldBeEqualTo 2
    }

    @Test
    fun `min sub list sum 4 and 7 returns 1`() {
        minSubListLength(listOf(4), 7) shouldBeEqualTo 0
    }

    @Test
    fun `min sub list sum 4 and 3 returns 0`() {
        minSubListLength(listOf(4), 3) shouldBeEqualTo 1
    }

    @Test
    fun `min sub list sum 1,2,3,2,5,8 and 7 returns 1`() {
        minSubListLength(listOf(2, 8), 7) shouldBeEqualTo 1
    }

    @Test
    fun `min sub list sum 1, 2, 11, 5, 9, 4, 6 and 22 returns 3`() {
        minSubListLength(listOf(1, 2, 11, 5, 9, 4, 6), 22) shouldBeEqualTo 3
    }

    @Test
    fun `min sub list sum 5, 6, 4, 15, 3, 8, 4 and 31 returns 4`() {
        minSubListLength(listOf(5, 6, 4, 15, 3, 8, 4), 31) shouldBeEqualTo 5
    }

    @Test
    fun `min sub list sum 1, 20, 11, 5, 9, 4, 6 and 200 returns 0`() {
        minSubListLength(listOf(1, 20, 11, 5, 9, 4, 6), 200) shouldBeEqualTo 0
    }

    @Test
    fun `min sub list sum 4, 6, 5 and 27 returns 0`() {
        minSubListLength(listOf(4, 6, 5), 27) shouldBeEqualTo 0
    }
}
