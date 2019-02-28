package com.igorwojda.string.issubstring

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun isSubstring(str: String, subStr: String): Boolean {
    TODO("not implemented")
}

class IsSubstringTest {
    @Test
    fun `abd not in abcd`() {
        isSubstring("abcd", "abd") shouldEqual false
    }

    @Test
    fun `e not in abcd`() {
        isSubstring("abcd", "e") shouldEqual false
    }

    @Test
    fun `ab in abd`() {
        isSubstring("abc", "ab") shouldEqual true
    }

    @Test
    fun `bc in abc`() {
        isSubstring("abc", "bc") shouldEqual true
    }

    @Test
    fun `abc in ababc`() {
        isSubstring("ababc", "abc") shouldEqual true
    }

    @Test
    fun `cd in abcdef`() {
        isSubstring("abcdef", "cd") shouldEqual true
    }

    @Test
    fun `empty sub-string not in abc`() {
        isSubstring("abc", "") shouldEqual false
    }

    @Test
    fun `abc not in empty string`() {
        isSubstring("", "abc") shouldEqual false
    }

    @Test
    fun `empty sub-string not in empt ystring`() {
        isSubstring("", "") shouldEqual false
    }
}
