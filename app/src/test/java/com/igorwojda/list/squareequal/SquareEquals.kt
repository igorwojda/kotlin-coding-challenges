package com.igorwojda.list.squareequal

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun squareEquals(list1: List<Int>, list2: List<Int>): Boolean {
    return false
}

class SquareEqualsTest {
    @Test
    fun `square equal single element lists`() {
        squareEquals(listOf(2), listOf(4)) shouldEqual true
    }

    @Test
    fun `square equal triple element list`() {
        squareEquals(listOf(1, 2, 3), listOf(9, 1, 4)) shouldEqual true
    }

    @Test
    fun `triple element list square not equal because of missing 2 square`() {
        squareEquals(listOf(1, 2, 3), listOf(9, 1, 7)) shouldEqual false
    }

    @Test
    fun `triple element list square not equal because of wrong size`() {
        squareEquals(listOf(1, 2, 3), listOf(9, 1)) shouldEqual false
    }

    @Test
    fun `triple element list square not equal because of wrong square frequency`() {
        squareEquals(listOf(1, 2, 1), listOf(4, 1, 4)) shouldEqual false
    }
}










