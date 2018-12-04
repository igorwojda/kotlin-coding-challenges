package com.igorwojda.codingpuzzle.string.maxchar

import org.amshove.kluent.shouldEqual
import org.junit.Test

// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

private fun maxChar(str: String): Char? {
    return 'a'
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

