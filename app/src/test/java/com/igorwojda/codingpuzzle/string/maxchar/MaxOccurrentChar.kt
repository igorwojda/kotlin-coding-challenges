package com.igorwojda.codingpuzzle.string.maxchar

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun maxOccurrentChar(str: String): Char? {
    return 'z'
}

class StringMaxCharTest {
    @Test
    fun `Finds the most frequently used char empty string`() {
        maxOccurrentChar("") shouldEqual null
    }

    @Test
    fun `Finds the most frequently used char "a"`() {
        maxOccurrentChar("a") shouldEqual 'a'
    }

    @Test
    fun `Finds the most frequently used char "abcdefghijklmnaaaaa"`() {
        maxOccurrentChar("abcdefghijklmnaaaaa") shouldEqual 'a'
    }

    @Test
    fun `Finds the most frequently used char "ab1c1d1e1f1g1"`() {
        maxOccurrentChar("ab1c1d1e1f1g1") shouldEqual '1'
    }
}
