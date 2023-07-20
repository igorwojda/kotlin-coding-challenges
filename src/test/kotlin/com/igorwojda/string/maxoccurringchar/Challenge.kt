package com.igorwojda.string.maxoccurringchar

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun maxOccurringChar(str: String): Char? {
    TODO("Add your solution here")
}

private class Test {
    @Test
    fun `Don't find a char in empty string`() {
        maxOccurringChar("") shouldBeEqualTo null
    }

    @Test
    fun `Finds char 'a' in string 'a'`() {
        maxOccurringChar("a") shouldBeEqualTo 'a'
    }

    @Test
    fun `Finds char 'a' in string 'abcdefghijklmnaaaaa'`() {
        maxOccurringChar("abcdefghijklmnaaaaa") shouldBeEqualTo 'a'
    }

    @Test
    fun `Finds char '1' in string 'ab1c1d1e1f1g1'`() {
        maxOccurringChar("ab1c1d1e1f1g1") shouldBeEqualTo '1'
    }
}
