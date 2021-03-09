package com.igorwojda.list.maxsublistsum

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import kotlin.math.max

private fun maxSubListSum(list: List<Int>, numElements: Int): Int? {
    TODO("not implemented")
}

private fun max(i1: Int?, i2: Int?): Int? {
    return when {
        i1 != null && i2 != null -> max(i1, i2)
        i1 != null && i2 == null -> i1
        i1 == null && i2 != null -> i2
        else -> null
    }
}

private class Test {
    @Test
    fun `max sublist sum for list 4, 2, 7 and n 2 `() {
        maxSubListSum(listOf(4, 2, 7), 2) shouldBeEqualTo 9
    }

    @Test
    fun `max sublist sum for list 4, 2, 7, 5, 8, 9, 5, 1 and n 3 `() {
        maxSubListSum(listOf(4, 2, 7, 5, 8, 9, 5, 1), 3) shouldBeEqualTo 22
    }

    @Test
    fun `max sublist sum for list 1,2,5,2,8,1,5 and n 4 `() {
        maxSubListSum(listOf(1, 2, 5, 2, 8, 1, 5), 4) shouldBeEqualTo 17
    }

    @Test
    fun `max sublist sum for empty list and n 5 `() {
        maxSubListSum(emptyList(), 5) shouldBeEqualTo null
    }
}
