package com.igorwojda.codingpuzzle.shape.pyramids

import org.amshove.kluent.shouldEqual
import org.junit.Test

fun pyramid(n: Int): List<String> {
    return listOf()
}

class PyramidsTest {

    @Test
    fun `pyramid n = 2`() {
        pyramid(2).also {
            it.size shouldEqual 2
            it[0] shouldEqual " # "
            it[1] shouldEqual "###"
        }
    }

    @Test
    fun `pyramid n = 3`() {
        pyramid(3).also {
            it.size shouldEqual 3
            it[0] shouldEqual "  #  "
            it[1] shouldEqual " ### "
            it[2] shouldEqual "#####"
        }
    }

    @Test
    fun `pyramid n = 4`() {
        pyramid(4).also {
            it.size shouldEqual 4
            it[0] shouldEqual "   #   "
            it[1] shouldEqual "  ###  "
            it[2] shouldEqual " ##### "
            it[3] shouldEqual "#######"
        }
    }
}
