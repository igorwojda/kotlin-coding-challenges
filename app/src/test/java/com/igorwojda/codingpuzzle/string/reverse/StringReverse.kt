package com.igorwojda.codingpuzzle.string.reverse

import org.amshove.kluent.shouldEqual
import org.junit.Assert
import org.junit.Test

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



