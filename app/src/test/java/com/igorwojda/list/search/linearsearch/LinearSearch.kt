package com.igorwojda.list.search.linearsearch

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun getIndex(list: List<String>, str: String): Int {
    return -1
}

class LinearSearchTest {
    @Test
    fun `index of 'A' in 'A, B, C' is 0`() {
        getIndex(listOf("A", "B", "C"), "A") shouldEqual 0
    }

    @Test
    fun `index of 'B' in 'A, B, C' is 1`() {
        getIndex(listOf("A", "B", "C"), "B") shouldEqual 1
    }

    @Test
    fun `index of 'C' in 'A, B, C' is 2`() {
        getIndex(listOf("A", "B", "C"), "C") shouldEqual 2
    }

    @Test
    fun `index of 'D' in 'A, B, C' is -1`() {
        getIndex(listOf("A", "B", "C"), "D") shouldEqual -1
    }
}
