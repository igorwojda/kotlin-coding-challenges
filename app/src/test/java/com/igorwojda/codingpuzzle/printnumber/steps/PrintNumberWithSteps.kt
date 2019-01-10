package com.igorwojda.codingpuzzle.printnumber.steps

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun printNumber(n: Int, step: Int = 1): List<Int> {
    return listOf()
}

class RecursivePrintNumberWithSteps {
    @Test
    fun `printNumber 0 step 1 should return listOf()`() {
        printNumber(0, 1) shouldEqual listOf()
    }

    @Test
    fun `printNumber 1 step 1 should return listOf(1)`() {
        printNumber(1, 1) shouldEqual listOf(1)
    }

    @Test
    fun `printNumber 3 step 2 should return listOf(3, 2, 1)`() {
        printNumber(3, 2) shouldEqual listOf(3, 1)
    }

    @Test
    fun `printNumber 11 step 3 should return listOf(5, 4, 3, 2, 1)`() {
        printNumber(11, 3) shouldEqual listOf(11, 8, 5, 2)
    }
}
