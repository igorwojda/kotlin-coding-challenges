package com.igorwojda.codingpuzzle

import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldThrow
import org.junit.Test

private fun factorial(n: Long): Long {
    require(n >= 0) { "Underflow error in factorial" }
    require(n <= 20) { "Overflow error in factorial" }

    return if (n == 0L) 1 else n * factorial(n - 1)
}

class RecursiveFactorial {
    @Test
    fun `factorial -1 should throw exception` () {
        val func = { factorial(-1) }
        func shouldThrow IllegalArgumentException::class
    }

    @Test
    fun `factorial 21 should throw exception` () {
        val func = { factorial(21) }
        func shouldThrow IllegalArgumentException::class
    }

    @Test
    fun `factorial 0 should equal 1` () {
        factorial(0) shouldEqual 1
    }

    @Test
    fun `factorial 10 should equal 3628800` () {
        factorial(10) shouldEqual 3628800
    }
}
