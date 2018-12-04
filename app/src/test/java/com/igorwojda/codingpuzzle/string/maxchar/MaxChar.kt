package com.igorwojda.codingpuzzle.string.maxchar

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun maxChar(str: String): Char? {
    return 'z'
}

class StringMaxCharTest {
    @Test
    fun `Finds the most frequently used char empty string`() {
        maxChar("") shouldEqual null
    }

    @Test
    fun `Finds the most frequently used char "a"`() {
        maxChar("a") shouldEqual 'a'
    }

    @Test
    fun `Finds the most frequently used char "abcdefghijklmnaaaaa"`() {
        maxChar("abcdefghijklmnaaaaa") shouldEqual 'a'
    }

    @Test
    fun `Finds the most frequently used char "ab1c1d1e1f1g1"`() {
        maxChar("ab1c1d1e1f1g1") shouldEqual '1'
    }
}

