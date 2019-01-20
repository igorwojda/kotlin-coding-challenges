package com.igorwojda.integer.countdown

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun countDown(n: Int): List<Int> {
    return emptyList()
}

class CountDownTest {
    @Test
    fun `count down 0`() {
        countDown(0) shouldEqual listOf(0)
    }

    @Test
    fun `count down 1`() {
        countDown(1) shouldEqual listOf(1, 0)
    }

    @Test
    fun `count down 5`() {
        countDown(5) shouldEqual listOf(5, 4, 3, 2, 1, 0)
    }
}
