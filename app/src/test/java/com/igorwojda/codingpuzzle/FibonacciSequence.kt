package com.igorwojda.codingpuzzle

import org.amshove.kluent.shouldEqual
import org.junit.Test

// --- Directions
// Print out the n-th entry in the fibonacciSequence series.
// The fibonacciSequence series is an ordering of numbers where
// each number is the sum of the preceding two.
// For example, the sequence
//  [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
// forms the first ten entries of the fibonacciSequence series.
// Example:
//   fibonacciSequence(4) == 3

private fun fibonacciSequence(n: Int): Int {
    if(n == 0) {
        return 0
    } else if (n == 1) {
        return 1
    }

    var prevPrev = 0
    var prev = 1
    var current = 0

    (2..n).forEach {
        current = prevPrev + prev
        prevPrev = prev
        prev = current
    }

    return current
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
