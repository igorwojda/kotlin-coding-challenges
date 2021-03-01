package com.igorwojda.integer.fibonacci.recursivecached

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

private fun fibonacciSequenceRecursiveCached(n: Int, methodCache: MutableList<MethodCache> = mutableListOf()): Int {
    if (n < 2) {
        return n
    }

    return fibonacciSequenceRecursiveCached(n - 1) + fibonacciSequenceRecursiveCached(n - 2)
}

private data class MethodCache(val n: Int, val result: Int)

class FibonacciSeriesRecursiveMethodCacheTest {
    @Test
    fun `calculates correct fib value for 0`() {
        fibonacciSequenceRecursiveCached(0) shouldBeEqualTo 0
    }

    @Test
    fun `calculates correct fib value for 1`() {
        fibonacciSequenceRecursiveCached(1) shouldBeEqualTo 1
    }

    @Test
    fun `calculates correct fib value for 2`() {
        fibonacciSequenceRecursiveCached(2) shouldBeEqualTo 1
    }

    @Test
    fun `calculates correct fib value for 3`() {
        fibonacciSequenceRecursiveCached(3) shouldBeEqualTo 2
    }

    @Test
    fun `calculates correct fib value for 4`() {
        fibonacciSequenceRecursiveCached(4) shouldBeEqualTo 3
    }

    @Test(timeout = 500)
    fun `calculates correct fib value for 45`() {
        fibonacciSequenceRecursiveCached(45) shouldBeEqualTo 1134903170
    }
}
