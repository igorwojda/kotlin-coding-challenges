package com.igorwojda.codingpuzzle

import org.amshove.kluent.shouldEqual
import org.junit.Test

// --- Directions
// Given a string, return true if the string is a palindrome
// or false if it is not.  Palindromes are strings that
// form the same word if it is reversed. *Do* include spaces
// and punctuation in determining if the string is a palindrome.
// In this exercise we will allows one bad character. Our string will be (tolerant)
// palindrome if after removing one
// character string is a palindrome
// --- Examples:
//   tolerantPalindrome("abba") == true
//   tolerantPalindrome("abb!a") == true
//   tolerantPalindrome("abcdefg") == false

private fun tolerantPalindrome(str: String): Boolean {
    return false
}

class PalindromeWithToleranceTest {

    @Test
    fun `"aba" is a palindrome`() {
        tolerantPalindrome("aba") shouldEqual true
    }

    @Test
    fun `"ab!a" is a palindrome`() {
        tolerantPalindrome("ab!a") shouldEqual true
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
