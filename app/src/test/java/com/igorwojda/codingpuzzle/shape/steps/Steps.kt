package com.igorwojda.codingpuzzle.shape.steps

import org.amshove.kluent.shouldEqual
import org.junit.Test

fun steps(n: Int): List<String> {
    return listOf()
}

class StepsTest {
    @Test
    fun `steps n = 1`() {
        val result = steps(1)
        result.size shouldEqual 1
        result[0] shouldEqual "#"
    }

    @Test
    fun `steps n = 2`() {
        val result = steps(2)
        result.size shouldEqual 2
        result[0] shouldEqual "# "
        result[1] shouldEqual "##"
    }

    @Test
    fun `steps n = 3`() {
        val result = steps(3)
        result.size shouldEqual 3
        result[0] shouldEqual "#  "
        result[1] shouldEqual "## "
        result[2] shouldEqual "###"
    }
}
