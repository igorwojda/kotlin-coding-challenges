package com.igorwojda.integer.factorial

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun factorial(n: Int): Int {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `factorial 0 should equal 1`() {
        factorial(0) shouldBeEqualTo 1
    }

    @Test
    fun `factorial 3 should equal 6`() {
        factorial(3) shouldBeEqualTo 6
    }

    @Test
    fun `factorial 5 should equal 120`() {
        factorial(5) shouldBeEqualTo 120
    }

    @Test
    fun `factorial 10 should equal 3628800`() {
        factorial(10) shouldBeEqualTo 3628800
    }
}
