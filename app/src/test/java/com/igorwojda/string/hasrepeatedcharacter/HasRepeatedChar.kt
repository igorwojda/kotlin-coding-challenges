package com.igorwojda.string.hasrepeatedcharacter

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

private fun hasRepeatedChar(str: String): Boolean {
    TODO("not implemented")
}

class RepeatedCharacterTest {
    @Test
    fun `"abc" don't have repeated character`() {
        hasRepeatedChar("abc") shouldBeEqualTo false
    }

    @Test
    fun `"aabc" has repeated character`() {
        hasRepeatedChar("aabc") shouldBeEqualTo true
    }

    @Test
    fun `"aabcc" has repeated character`() {
        hasRepeatedChar("aabcc") shouldBeEqualTo true
    }
}
