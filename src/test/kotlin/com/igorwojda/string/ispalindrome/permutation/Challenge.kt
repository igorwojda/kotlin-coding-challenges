package com.igorwojda.string.ispalindrome.permutation

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun isPermutationPalindrome(str: String): Boolean {
    TODO("Add your solution here")
}

private class Test {
    @Test
    fun `'gikig' is a palindrome`() {
        isPermutationPalindrome("gikig") shouldBeEqualTo true
    }

    @Test
    fun `'ookvk' is a palindrome`() {
        isPermutationPalindrome("ookvk") shouldBeEqualTo true
    }

    @Test
    fun `'sows' is not a palindrome`() {
        isPermutationPalindrome("sows") shouldBeEqualTo false
    }

    @Test
    fun `'tami' is not a palindrome`() {
        isPermutationPalindrome("tami") shouldBeEqualTo false
    }

    @Test
    fun `'oooo' is a palindrome`() {
        isPermutationPalindrome("oooo") shouldBeEqualTo true
    }

    @Test
    fun `'aab' is a palindrome`() {
        isPermutationPalindrome("aab") shouldBeEqualTo true
    }

    @Test
    fun `empty string is a palindrome`() {
        isPermutationPalindrome("") shouldBeEqualTo true
    }
}
