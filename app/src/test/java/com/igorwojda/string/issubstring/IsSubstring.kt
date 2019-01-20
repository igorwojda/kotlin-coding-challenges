package com.igorwojda.string.issubstring

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun isSubstring(str: String, subStr: String): Boolean {
    return false
}

class IsSubstringTest {
    @Test
    fun `substring is at the beginning`() {
        isSubstring("abc", "ab") shouldEqual true
    }

    @Test
    fun `substring us at the end`() {
        isSubstring("abc", "bc") shouldEqual true
    }

    @Test
    fun `substring is in the middle`() {
        isSubstring("abcdef", "cd") shouldEqual true
    }

    @Test
    fun `substring is empty`() {
        isSubstring("abc", "") shouldEqual false
    }

    @Test
    fun `string is empty`() {
        isSubstring("", "abc") shouldEqual false
    }

    @Test
    fun `first string and substring are empty`() {
        isSubstring("", "") shouldEqual false
    }
}
