package com.igorwojda.string.repeated

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun hasRepeatedCharacter(str: String): Boolean {
    return false
}

class RepeatedCharacterTest {
    @Test
    fun `"abc" don't have repeated character`() {
        hasRepeatedCharacter("abc") shouldEqual false
    }

    @Test
    fun `"aabc" has repeated character`() {
        hasRepeatedCharacter("aabc") shouldEqual true
    }

    @Test
    fun `"aabcc" has repeated character`() {
        hasRepeatedCharacter("aabcc") shouldEqual true
    }
}
