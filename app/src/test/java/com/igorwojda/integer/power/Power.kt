package com.igorwojda.integer.power

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun power(base: Int, exponent: Int): Int {
    return 0
}

class PowerTest {
    @Test
    fun `power 2^1 returns 2`() {
        power(2, 1) shouldEqual Math.pow(2.0, 1.0).toInt()
    }

    @Test
    fun `power 2^2 returns 2`() {
        power(2, 2) shouldEqual Math.pow(2.0, 2.0).toInt()
    }

    @Test
    fun `power 2^3 returns 8`() {
        power(2, 3) shouldEqual Math.pow(2.0, 3.0).toInt()
    }

    @Test
    fun `power 3^4 returns 81`() {
        power(3, 4) shouldEqual Math.pow(3.0, 4.0).toInt()
    }

    @Test
    fun `power 3^-1 returns 0`() {
        power(3, -1) shouldEqual Math.pow(3.0, -1.0).toInt()
    }

    @Test
    fun `power 3^0 returns 1`() {
        power(3, 0) shouldEqual Math.pow(3.0, 0.0).toInt()
    }

    @Test
    fun `power 3^-2 returns 0`() {
        power(3, -2) shouldEqual Math.pow(3.0, -2.0).toInt()
    }
}
