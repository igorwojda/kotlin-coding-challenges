package com.igorwojda.list.search.linearsearch

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun getIndex(list: List<String>, str: String): Int {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `index of 'A' in 'A, B, C' is 0`() {
        getIndex(listOf("A", "B", "C"), "A") shouldBeEqualTo 0
    }

    @Test
    fun `index of 'B' in 'A, B, C' is 1`() {
        getIndex(listOf("A", "B", "C"), "B") shouldBeEqualTo 1
    }

    @Test
    fun `index of 'C' in 'A, B, C' is 2`() {
        getIndex(listOf("A", "B", "C"), "C") shouldBeEqualTo 2
    }

    @Test
    fun `index of 'D' in 'A, B, C' is -1`() {
        getIndex(listOf("A", "B", "C"), "D") shouldBeEqualTo -1
    }
}
