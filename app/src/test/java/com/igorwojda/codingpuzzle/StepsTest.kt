package com.igorwojda.codingpuzzle

import org.amshove.kluent.shouldEqual
import org.junit.Test

// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a step shape
// with N levels using the # character.  Make sure the
// step has spaces on the right hand side!
// --- Examples
//   steps(2)
//       '# '
//       '##'
//   steps(3)
//       '#  '
//       '## '
//       '###'
//   steps(4)
//       '#   '
//       '##  '
//       '### '
//       '####'

fun steps(n: Int): List<String> {
    return listOf()
}

class StepsTest {
    @Test
    fun `steps called with n = 1`() {
        val result = steps(1)
        result.size shouldEqual 1
        result[0] shouldEqual "#"
    }

    @Test
    fun `steps called with n = 2`() {
        val result = steps(2)
        result.size shouldEqual 2
        result[0] shouldEqual "# "
        result[1] shouldEqual "##"
    }

    @Test
    fun `steps called with n = 3`() {
        val result = steps(3)
        result.size shouldEqual 3
        result[0] shouldEqual "#  "
        result[1] shouldEqual "## "
        result[2] shouldEqual "###"
    }
}

