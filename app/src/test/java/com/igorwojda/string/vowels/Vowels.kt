package com.igorwojda.string.vowels

import org.amshove.kluent.shouldEqual
import org.junit.Test

fun vowels(str: String): Int {
    return 0
}

class VowelsTest {
    @Test
    fun `returns the number of vowels used in "aeiouy"`() {
        vowels("aeiouy") shouldEqual 6
    }

    @Test
    fun `returns the number of vowels used in "AEIOUY" when they are capitalized`() {
        vowels("AEIOUY") shouldEqual 6
    }

    @Test
    fun `returns the number of vowels used in "abcdefghijklmnopqrstuvwxyz"`() {
        vowels("abcdefghijklmnopqrstuvwxyz") shouldEqual 6
    }

    @Test
    fun `returns the number of vowels used in "bcdfghjkl`() {
        vowels("bcdfghjkl") shouldEqual 0
    }
}
