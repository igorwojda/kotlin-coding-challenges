package com.igorwojda.codingpuzzle.shape.pyramids

import org.amshove.kluent.shouldEqual
import org.junit.Test

// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a pyramid shape
// with N levels using the # character.  Make sure the
// pyramid has spaces on both the left *and* right hand sides
// --- Examples
//   pyramid(1)
//       '#'
//   pyramid(2)
//       ' # '
//       '###'
//   pyramid(3)
//       '  #  '
//       ' ### '
//       '#####'

fun pyramid(n: Int): List<String> {
    return listOf()
}

class PyramidsTest {

    @Test
    fun `prints a pryamid for n = 2`() {
        pyramid(2).also {
            it.size shouldEqual 2
            it[0] shouldEqual " # "
            it[1] shouldEqual "###"
        }
    }

    @Test
    fun `prints a pryamid for n = 3`() {
        pyramid(3).also {
            it.size shouldEqual 3
            it[0] shouldEqual "  #  "
            it[1] shouldEqual " ### "
            it[2] shouldEqual "#####"

        }
    }

    @Test
    fun `prints a pryamid for n = 4`() {
        pyramid(4).also {
            it.size shouldEqual 4
            it[0] shouldEqual "   #   "
            it[1] shouldEqual "  ###  "
            it[2] shouldEqual " ##### "
            it[3] shouldEqual "#######"
        }
    }
}
