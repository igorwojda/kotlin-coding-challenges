package com.igorwojda.codingpuzzle.string.reverse

import org.amshove.kluent.shouldEqual
import org.junit.Assert
import org.junit.Test

// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') == 'leppa'
//   reverse('hello') == 'olleh'
//   reverse('Greetings!') == '!sgniteerG'
//
//Limitations:
//Don't use String.reverse function

private fun reverse(str: String): String {
    return ""
}

class StringReverseTest {
    @Test
    fun `Reverse reverses a string 1`() {
        reverse("abcd") shouldEqual "dcba"
    }

    @Test
    fun `Reverse reverses a string 2`() {
        reverse("  abcd") shouldEqual "dcba  "
    }

    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, 2 + 2)
    }
}



