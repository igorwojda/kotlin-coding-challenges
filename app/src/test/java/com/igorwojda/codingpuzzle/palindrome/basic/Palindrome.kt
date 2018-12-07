package com.igorwojda.codingpuzzle.palindrome.basic

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun palindrome(str: String): Boolean {
    return false
}

class PalindromeTest {

    @Test
    fun `"aba" is a palindrome`() {
        palindrome("aba") shouldEqual true
    }

    @Test
    fun `" aba" is not a palindrome`() {
        palindrome(" aba") shouldEqual false
    }

    @Test
    fun `"aba " is not a palindrome`() {
        palindrome("aba ") shouldEqual false
    }

    @Test
    fun `"greetings" is not a palindrome`() {
        palindrome("greetings") shouldEqual false
    }

    @Test
    fun `"1000000001" a palindrome`() {
        palindrome("1000000001") shouldEqual true
    }

    @Test
    fun `"Fish hsif" is not a palindrome`() {
        palindrome("Fish hsif") shouldEqual false
    }

    @Test
    fun `"pennep" a palindrome`() {
        palindrome("pennep") shouldEqual true
    }
}
