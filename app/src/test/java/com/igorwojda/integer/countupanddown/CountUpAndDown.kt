package com.igorwojda.integer.countupanddown

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun countUpAndDown(n: Int): List<Int> {
    return emptyList()
}


class CountUpAndDownTest {
    @Test
    fun `count up and down 0`() {
        countUpAndDown(0) shouldEqual listOf(0)
    }

    @Test
    fun `count up and down 1`() {
        countUpAndDown(1) shouldEqual listOf(0, 1, 0)
    }

    @Test
    fun `count up and down 2`() {
        countUpAndDown(2) shouldEqual listOf(0, 1, 2, 1, 0)
    }

    @Test
    fun `count up and down 3`() {
        countUpAndDown(3) shouldEqual listOf(0, 1, 2, 3, 2, 1, 0)
    }

    @Test
    fun `count up and down 4`() {
        countUpAndDown(4) shouldEqual listOf(0, 1, 2, 3, 4, 3, 2, 1, 0)
    }

    @Test
    fun `count up and down 9`() {
        countUpAndDown(9) shouldEqual listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
    }
}
