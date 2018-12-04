package com.igorwojda.codingpuzzle.recursivefactorial

import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldThrow
import org.junit.Test

private fun factorial(n: Long): Long {
    return 0L
}

class RecursiveFactorial {
    @Test
    fun `factorial -1 should throw exception`() {
        val func = { factorial(-1) }
        func shouldThrow IllegalArgumentException::class
    }

    @Test
    fun `factorial 21 should throw exception`() {
        val func = { factorial(21) }
        func shouldThrow IllegalArgumentException::class
    }

    @Test
    fun `factorial 0 should equal 1`() {
        factorial(0) shouldEqual 1
    }

    @Test
    fun `factorial 10 should equal 3628800`() {
        factorial(10) shouldEqual 3628800
    }
}
