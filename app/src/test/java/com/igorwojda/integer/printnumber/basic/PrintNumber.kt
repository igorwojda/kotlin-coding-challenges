package com.igorwojda.integer.printnumber.basic

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun printNumber(n: Int): List<Int> {
    return listOf()
}

class RecursivePrintNumber {
    @Test
    fun `printNumber 0 return listOf()`() {
        printNumber(0) shouldEqual listOf()
    }

    @Test
    fun `printNumber 1 return listOf(1)`() {
        printNumber(1) shouldEqual listOf(1)
    }

    @Test
    fun `printNumber 3 return listOf(3, 2, 1)`() {
        printNumber(3) shouldEqual listOf(3, 2, 1)
    }

    @Test
    fun `printNumber 5 return listOf(5, 4, 3, 2, 1)`() {
        printNumber(5) shouldEqual listOf(5, 4, 3, 2, 1)
    }
}
