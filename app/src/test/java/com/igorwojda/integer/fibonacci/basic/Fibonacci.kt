package com.igorwojda.integer.fibonacci.basic

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun fibonacci(n: Int): Int {
    TODO("not implemented")
}

class FibonacciSeriesTest {
    @Test
    fun `calculates correct fib value for 0`() {
        fibonacci(0) shouldEqual 0
    }

    @Test
    fun `calculates correct fib value for 1`() {
        fibonacci(1) shouldEqual 1
    }

    @Test
    fun `calculates correct fib value for 2`() {
        fibonacci(2) shouldEqual 1
    }

    @Test
    fun `calculates correct fib value for 3`() {
        fibonacci(3) shouldEqual 2
    }

    @Test
    fun `calculates correct fib value for 4`() {
        fibonacci(4) shouldEqual 3
    }

    @Test
    fun `calculates correct fib value for 15`() {
        fibonacci(39) shouldEqual 63245986
    }
}
