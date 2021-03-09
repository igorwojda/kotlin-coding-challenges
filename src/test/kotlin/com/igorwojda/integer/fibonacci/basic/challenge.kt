package com.igorwojda.integer.fibonacci.basic

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun fibonacci(n: Int): Int {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `calculates correct fib value for 0`() {
        fibonacci(0) shouldBeEqualTo 0
    }

    @Test
    fun `calculates correct fib value for 1`() {
        fibonacci(1) shouldBeEqualTo 1
    }

    @Test
    fun `calculates correct fib value for 2`() {
        fibonacci(2) shouldBeEqualTo 1
    }

    @Test
    fun `calculates correct fib value for 3`() {
        fibonacci(3) shouldBeEqualTo 2
    }

    @Test
    fun `calculates correct fib value for 4`() {
        fibonacci(4) shouldBeEqualTo 3
    }

    @Test
    fun `calculates correct fib value for 15`() {
        fibonacci(39) shouldBeEqualTo 63245986
    }
}
