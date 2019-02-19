package com.igorwojda.integer.factorial

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun factorial(n: Int): Int {
    return -1
}

class RecursiveFactorial {
    @Test
    fun `factorial 0 should equal 1`() {
        factorial(0) shouldEqual 1
    }

    @Test
    fun `factorial 3 should equal 6`() {
        factorial(3) shouldEqual 6
    }

    @Test
    fun `factorial 5 should equal 120`() {
        factorial(5) shouldEqual 120
    }

    @Test
    fun `factorial 10 should equal 3628800`() {
        factorial(10) shouldEqual 3628800
    }
}
