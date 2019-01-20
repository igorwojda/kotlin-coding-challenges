package com.igorwojda.string.reverse

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun reverse(str: String): String {
    if (str.isEmpty()) {
        return str
    }

    return reverse(str.drop(1)) + str.first()
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
}
