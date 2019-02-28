package com.igorwojda.string.ispalindrome.basic

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun isPalindrome(str: String): Boolean {
    TODO("not implemented")
}

class IsPalindromeTest {

    @Test
    fun `"aba" is a palindrome`() {
        isPalindrome("aba") shouldEqual true
    }

    @Test
    fun `" aba" is not a palindrome`() {
        isPalindrome(" aba") shouldEqual false
    }

    @Test
    fun `"aba " is not a palindrome`() {
        isPalindrome("aba ") shouldEqual false
    }

    @Test
    fun `"greetings" is not a palindrome`() {
        isPalindrome("greetings") shouldEqual false
    }

    @Test
    fun `"1000000001" a palindrome`() {
        isPalindrome("1000000001") shouldEqual true
    }

    @Test
    fun `"Fish hsif" is not a palindrome`() {
        isPalindrome("Fish hsif") shouldEqual false
    }

    @Test
    fun `"pennep" a palindrome`() {
        isPalindrome("pennep") shouldEqual true
    }
}
