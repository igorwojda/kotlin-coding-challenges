package com.igorwojda.list.listchunk

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun chunk(list: List<Int>, size: Int): List<List<Int>> {
    return listOf(listOf())
}

class ListChunkTest {
    @Test
    fun `chunk divides an list of 10 elements with chunk size 2`() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        chunk(list, 2) shouldEqual listOf(
            listOf(1, 2), listOf(3, 4), listOf(5, 6), listOf(7, 8), listOf(9, 10)
        )
    }

    @Test
    fun `chunk divides an list of 3 elements with chunk size 1`() {
        val list = listOf(1, 2, 3)
        chunk(list, 1) shouldEqual listOf(listOf(1), listOf(2), listOf(3))
    }

    @Test
    fun `chunk divides an list of 5 elements with chunk size 3`() {
        val list = listOf(1, 2, 3, 4, 5)
        chunk(list, 3) shouldEqual listOf(listOf(1, 2, 3), listOf(4, 5))
    }

    @Test
    fun `chunk divides an list of 13 elements with chunk size 5`() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
        chunk(list, 5) shouldEqual listOf(listOf(1, 2, 3, 4, 5), listOf(6, 7, 8, 9, 10), listOf(11, 12, 13))
    }
}
