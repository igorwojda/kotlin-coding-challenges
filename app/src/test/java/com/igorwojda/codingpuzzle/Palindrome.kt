package com.igorwojda.codingpuzzle

import org.amshove.kluent.shouldEqual
import org.junit.Test

// --- Directions
// Given a string, return true if the string is a palindrome
// or false if it is not.  Palindromes are strings that
// form the same word if it is reversed. *Do* include spaces
// and punctuation in determining if the string is a palindrome.
// --- Examples:
//   palindrome("abba") == true
//   palindrome("abcdefg") == false

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
