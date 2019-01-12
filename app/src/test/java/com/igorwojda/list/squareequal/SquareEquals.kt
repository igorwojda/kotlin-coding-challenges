package com.igorwojda.list.squareequal

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun squareEquals(list1: List<Int>, list2: List<Int>): Boolean {
    if (list1.size != list2.size) {
        return false
    }

    val frequencyCounter1 = mutableMapOf<Int, Int>()
    list1.forEach {
        val key = it * it
        frequencyCounter1.merge(key, 1, Int::plus)
    }

    val frequencyCounter2 = mutableMapOf<Int, Int>()
    list2.forEach {
        frequencyCounter2.merge(it, 1, Int::plus)
    }

    return frequencyCounter1 == frequencyCounter2
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










