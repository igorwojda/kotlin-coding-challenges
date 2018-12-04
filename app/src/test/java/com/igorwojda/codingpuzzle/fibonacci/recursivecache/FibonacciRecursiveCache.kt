@file:JvmName("MethodCacheKt")

package com.igorwojda.codingpuzzle.fibonacci.recursivecache

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun fibonacciSequenceRecursiveCache(n: Int, methodCache: MutableList<MethodCache> = mutableListOf()): Int {
    if (n < 2) {
        return n
    }

    return fibonacciSequenceRecursiveCache(n - 1) + fibonacciSequenceRecursiveCache(n - 2)
}

//@Test(timeout=1000)
class FibonacciSeriesRecursiveMethodCacheTest {
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

    @Test(timeout = 500)
    fun `calculates correct fib value for 45`() {
        fibonacciSequenceRecursiveCache(45) shouldEqual 1134903170
    }
}
