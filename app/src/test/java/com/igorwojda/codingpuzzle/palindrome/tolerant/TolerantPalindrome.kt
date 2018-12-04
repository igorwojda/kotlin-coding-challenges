package com.igorwojda.codingpuzzle.palindrome.tolerant

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun tolerantPalindrome(str: String, characterRemoved: Boolean = false): Boolean {
    return false
}

class TolerantPalindromeTest {
    @Test
    fun `"aba" is a palindrome`() {
        tolerantPalindrome("aba") shouldEqual true
    }

    @Test
    fun `"ab!a" is a palindrome`() {
        tolerantPalindrome("ab!a") shouldEqual true
    }

    @Test
    fun `"a!ba" is a palindrome`() {
        tolerantPalindrome("a!ba") shouldEqual true
    }

    @Test
    fun `" aba" is a palindrome`() {
        tolerantPalindrome(" aba") shouldEqual true
    }

    @Test
    fun `"aa#!aa " is not a palindrome`() {
        tolerantPalindrome("aa#!aa ") shouldEqual false
    }

    @Test
    fun `"greetings" is not a palindrome`() {
        tolerantPalindrome("greetings") shouldEqual false
    }

    @Test
    fun `"1000000001" a palindrome`() {
        tolerantPalindrome("1000000001") shouldEqual true
    }

    @Test
    fun `"10A00000001" is a palindrome`() {
        tolerantPalindrome("10A00000001") shouldEqual true
    }

    @Test
    fun `"Fish hsif" is not a palindrome`() {
        tolerantPalindrome("Fish hsif") shouldEqual false
    }

    @Test
    fun `"pennep" a palindrome`() {
        tolerantPalindrome("pennep") shouldEqual true
    }
}
