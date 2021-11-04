package com.igorwojda.string.ispalindrome.tolerant

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun isTolerantPalindrome(str: String, characterRemoved: Boolean = false): Boolean {
    for (i in 0..(str.length) / 2) {
        val rIndex = str.length - i - 1
        if (str[i] != str[rIndex]) {
            if (characterRemoved)
                return false
            return isTolerantPalindrome(str.substring(0 until i) + str.substring(i + 1 until str.length), true)
                    || isTolerantPalindrome(
                str.substring(0 until rIndex) + str.substring(rIndex + 1 until str.length),
                true
            )
        }
    }
    return true
}

private class Test {
    @Test
    fun `"aba" is a palindrome`() {
        isTolerantPalindrome("aba") shouldBeEqualTo true
    }

    @Test
    fun `"ab!a" is a palindrome`() {
        isTolerantPalindrome("ab!a") shouldBeEqualTo true
    }

    @Test
    fun `"a!ba" is a palindrome`() {
        isTolerantPalindrome("a!ba") shouldBeEqualTo true
    }

    @Test
    fun `" aba" is a palindrome`() {
        isTolerantPalindrome(" aba") shouldBeEqualTo true
    }

    @Test
    fun `"aa#!aa " is not a palindrome`() {
        isTolerantPalindrome("aa#!aa ") shouldBeEqualTo false
    }

    @Test
    fun `"greetings" is not a palindrome`() {
        isTolerantPalindrome("greetings") shouldBeEqualTo false
    }

    @Test
    fun `"1000000001" a palindrome`() {
        isTolerantPalindrome("1000000001") shouldBeEqualTo true
    }

    @Test
    fun `"Sa1lutulaS" a palindrome`() {
        isTolerantPalindrome("Sa1lutulaS") shouldBeEqualTo true
    }

    @Test
    fun `"10A00000001" is a palindrome`() {
        isTolerantPalindrome("10A00000001") shouldBeEqualTo true
    }

    @Test
    fun `"Fish hsif" is not a palindrome`() {
        isTolerantPalindrome("Fish hsif") shouldBeEqualTo false
    }

    @Test
    fun `"pennep" a palindrome`() {
        isTolerantPalindrome("pennep") shouldBeEqualTo true
    }
}
