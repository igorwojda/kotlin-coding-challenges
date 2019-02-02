package com.igorwojda.integer.stepsgenerator

import org.amshove.kluent.shouldEqual
import org.junit.Test

fun generateSteps(n: Int): List<String> {
    return listOf()
}

class StepsTest {
    @Test
    fun `steps n = 1`() {
        val result = generateSteps(1)
        result.size shouldEqual 1
        result[0] shouldEqual "#"
    }

    @Test
    fun `steps n = 2`() {
        val result = generateSteps(2)
        result.size shouldEqual 2
        result[0] shouldEqual "# "
        result[1] shouldEqual "##"
    }

    @Test
    fun `steps n = 3`() {
        val result = generateSteps(3)
        result.size shouldEqual 3
        result[0] shouldEqual "#  "
        result[1] shouldEqual "## "
        result[2] shouldEqual "###"
    }
}
