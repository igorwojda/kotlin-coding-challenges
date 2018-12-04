package com.igorwojda.codingpuzzle.fibonacci.classic

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun fibonacciSequence(n: Int): Int {
    return 0
}

class FibonacciSeriesTest {
    @Test
    fun `calculates correct fib value for 0`() {
        fibonacciSequence(0) shouldEqual 0
    }

    @Test
    fun `calculates correct fib value for 1`() {
        fibonacciSequence(1) shouldEqual 1
    }

    @Test
    fun `calculates correct fib value for 2`() {
        fibonacciSequence(2) shouldEqual 1
    }

    @Test
    fun `calculates correct fib value for 3`() {
        fibonacciSequence(3) shouldEqual 2
    }

    @Test
    fun `calculates correct fib value for 4`() {
        fibonacciSequence(4) shouldEqual 3
    }

    @Test
    fun `calculates correct fib value for 15`() {
        fibonacciSequence(39) shouldEqual 63245986
    }
}
