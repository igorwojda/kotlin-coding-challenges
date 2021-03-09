package com.igorwojda.list.squareequal

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun squareEquals(list: List<Int>, squared: List<Int>): Boolean {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `square 2 equal square 4`() {
        squareEquals(listOf(2), listOf(4)) shouldBeEqualTo true
    }

    @Test
    fun `square 1, 2, 3 equals square 9, 1, 4`() {
        squareEquals(listOf(1, 2, 3), listOf(9, 1, 4)) shouldBeEqualTo true
    }

    @Test
    fun `square 1, 2, 3 does not equal square 9, 1, 7`() {
        squareEquals(listOf(1, 2, 3), listOf(9, 1, 7)) shouldBeEqualTo false
    }

    @Test
    fun `square 1, 2, 3 does not equal square 9, 1`() {
        squareEquals(listOf(1, 2, 3), listOf(9, 1)) shouldBeEqualTo false
    }

    @Test
    fun `square 1, 2, 1 does not equal 4, 1, 4`() {
        squareEquals(listOf(1, 2, 1), listOf(4, 1, 4)) shouldBeEqualTo false
    }
}
