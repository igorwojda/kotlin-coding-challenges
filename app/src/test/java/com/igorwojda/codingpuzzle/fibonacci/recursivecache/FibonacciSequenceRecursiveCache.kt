package com.igorwojda.codingpuzzle.fibonacci.recursivecache

import org.amshove.kluent.shouldEqual
import org.junit.Test

// --- Directions
// Below functions print out the n-th entry in the fibonacciSequence series.
// However due to recursion it has exponential complexity (function si called multiple times with identical arguments).
// Store arguments of each call along with the result. If the function is called again with the same arguments,
// return the precomputed result rather than running the function again.

private fun fibonacciSequenceRecursiveCache(
    n: Int,
    fibonacciCache: MutableList<FibonacciCache> = mutableListOf()
): Int {
    if (n < 2) {
        return n
    }

    return fibonacciSequenceRecursiveCache(n - 1) + fibonacciSequenceRecursiveCache(
        n - 2
    )
}

class FibonacciSeriesRecursiveFibonacciCacheTest {
    @Test
    fun `calculates correct fib value for 0`() {
        fibonacciSequenceRecursiveCache(0) shouldEqual 0
    }

    @Test
    fun `calculates correct fib value for 1`() {
        fibonacciSequenceRecursiveCache(1) shouldEqual 1
    }

    @Test
    fun `calculates correct fib value for 2`() {
        fibonacciSequenceRecursiveCache(2) shouldEqual 1
    }

    @Test
    fun `calculates correct fib value for 3`() {
        fibonacciSequenceRecursiveCache(3) shouldEqual 2
    }

    @Test
    fun `calculates correct fib value for 4`() {
        fibonacciSequenceRecursiveCache(4) shouldEqual 3
    }

    @Test
    fun `calculates correct fib value for 15`() {
        fibonacciSequenceRecursiveCache(39) shouldEqual 63245986
    }
}
