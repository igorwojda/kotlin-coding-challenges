package com.igorwojda.integer.stepsgenerator

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

fun generateSteps(n: Int): List<String> {
    TODO("not implemented")
}

class StepsTest {
    @Test
    fun `steps n = 1`() {
        val result = generateSteps(1)
        result.size shouldBeEqualTo 1
        result[0] shouldBeEqualTo "#"
    }

    @Test
    fun `steps n = 2`() {
        val result = generateSteps(2)
        result.size shouldBeEqualTo 2
        result[0] shouldBeEqualTo "# "
        result[1] shouldBeEqualTo "##"
    }

    @Test
    fun `steps n = 3`() {
        val result = generateSteps(3)
        result.size shouldBeEqualTo 3
        result[0] shouldBeEqualTo "#  "
        result[1] shouldBeEqualTo "## "
        result[2] shouldBeEqualTo "###"
    }
}
