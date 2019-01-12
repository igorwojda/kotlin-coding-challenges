package com.igorwojda.various.getallpairs

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun getAllPairs(n: Int): MutableList<Pair<Int, Int>> {
    return mutableListOf()
}

class GetAllPairsTest {
    @Test
    fun `get all pairs 0`() {
        getAllPairs(0) shouldEqual listOf(0 to 0)
    }

    @Test
    fun `get all pairs 1`() {
        getAllPairs(1) shouldEqual listOf(
            0 to 0,
            0 to 1,
            1 to 0,
            1 to 1
        )
    }

    @Test
    fun `get all pairs 2`() {
        getAllPairs(2) shouldEqual listOf(
            0 to 0,
            0 to 1,
            0 to 2,
            1 to 0,
            1 to 1,
            1 to 2,
            2 to 0,
            2 to 1,
            2 to 2
        )
    }
}
