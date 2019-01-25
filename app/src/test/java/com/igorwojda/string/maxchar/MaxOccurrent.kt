package com.igorwojda.string.maxchar

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun maxOccurrentChar(str: String): Char? {
    return 'z'
}

class StringMaxCharTest {
    @Test
    fun `Don't find a char in empty string`() {
        maxOccurrentChar("") shouldEqual null
    }

    @Test
    fun `Finds char 'a' in string "a"`() {
        maxOccurrentChar("a") shouldEqual 'a'
    }

    @Test
    fun `Finds char 'a' in string "abcdefghijklmnaaaaa"`() {
        maxOccurrentChar("abcdefghijklmnaaaaa") shouldEqual 'a'
    }

    @Test
    fun `Finds char '1' in string "ab1c1d1e1f1g1"`() {
        maxOccurrentChar("ab1c1d1e1f1g1") shouldEqual '1'
    }
}
