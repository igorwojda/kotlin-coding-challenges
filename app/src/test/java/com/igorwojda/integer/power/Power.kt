package com.igorwojda.integer.power

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun power(base: Int, exponent: Int): Int {
    return 0
}

class PowerTest {
    @Test
    fun `power 2^1 returns 2`() {
        power(2, 1) shouldEqual 2
    }

    @Test
    fun `power 2^2 returns 2`() {
        power(2, 2) shouldEqual 4
    }

    @Test
    fun `power 2^3 returns 8`() {
        power(2, 3) shouldEqual 8
    }

    @Test
    fun `power 3^4 returns 81`() {
        power(3, 4) shouldEqual 81
    }
}
