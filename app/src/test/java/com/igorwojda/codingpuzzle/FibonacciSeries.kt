package com.igorwojda.codingpuzzle

import org.amshove.kluent.shouldEqual
import org.junit.Test

// --- Directions
// Print out the n-th entry in the fibonacci series.
// The fibonacci series is an ordering of numbers where
// each number is the sum of the preceding two.
// For example, the sequence
//  [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
// forms the first ten entries of the fibonacci series.
// Example:
//   fibonacci(4) === 3

private fun fibonacci(n: Int): Int {
    return 0
}

class FibonacciSeriesTest {
    @Test
    fun `calculates correct fib value for 1` () {
        fibonacci(1) shouldEqual 1
    }

    @Test fun `calculates correct fib value for 2` () {
        fibonacci(2) shouldEqual 1
    }

    @Test fun `calculates correct fib value for 3` () {
        fibonacci(3) shouldEqual 2
    }

    @Test fun `calculates correct fib value for 4` () {
        fibonacci(4) shouldEqual 3
    }

    @Test fun `calculates correct fib value for 15` () {
        fibonacci(39) shouldEqual 63245986
    }
}
