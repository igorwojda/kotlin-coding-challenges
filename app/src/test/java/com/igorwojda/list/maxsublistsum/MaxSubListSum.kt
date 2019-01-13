package com.igorwojda.list.maxsublistsum

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun maxSubListSum(list: List<Int>, n: Int): Int? {
    return null
}

class MaxSubListTest {
    @Test
    fun `max sublist sum for list 4, 2, 7 and n 2 `() {
        maxSubListSum(listOf(4, 2, 7), 2) shouldEqual 9
    }

    @Test
    fun `max sublist sum for list 4, 2, 7, 5, 8, 9, 5, 1 and n 3 `() {
        maxSubListSum(listOf(4, 2, 7, 5, 8, 9, 5, 1), 3) shouldEqual 22
    }

    @Test
    fun `max sublist sum for list 1,2,5,2,8,1,5 and n 4 `() {
        maxSubListSum(listOf(1, 2, 5, 2, 8, 1, 5), 4) shouldEqual 17
    }

    @Test
    fun `max sublist sum for empty list and n 5 `() {
        maxSubListSum(emptyList(), 5) shouldEqual null
    }
}
