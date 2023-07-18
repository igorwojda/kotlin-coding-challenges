package com.igorwojda.list.medianoftwosorted

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

fun medianOfSortedLists(list1: List<Int>, list2: List<Int>): Double {

}

private class Test {
    @Test
    fun `median of sorted lists 1, 3 and 2 returns 2`() {
        medianOfSortedLists(listOf(1, 3), listOf(2)) shouldBeEqualTo 2
    }

    @Test
    fun `median of sorted lists 1, 2 and 3,4 returns 2,5`() {
        medianOfSortedLists(listOf(1, 3), listOf(2)) shouldBeEqualTo 2.5
    }
}
