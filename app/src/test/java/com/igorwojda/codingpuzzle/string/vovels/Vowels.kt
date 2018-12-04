package com.igorwojda.codingpuzzle.string.vovels

import org.amshove.kluent.shouldEqual
import org.junit.Test

// --- Directions
// Write a function that returns the number of vowels
// used in a string.  Vowels are the characters 'a', 'e'
// 'i', 'o', 'u' and 'y'.
// --- Examples
//   vowels('Hi There!') --> 3
//   vowels('Why do you ask?') --> 4
//   vowels('Why?') --> 0

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
