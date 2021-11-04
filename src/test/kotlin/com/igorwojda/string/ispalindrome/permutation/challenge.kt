package com.igorwojda.string.ispalindrome.permutation

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun isPalindrome(str: String): Boolean {
    for (i in 0 until str.length / 2) {
        if (str[i] != str[str.length - 1 - i])
            return false
    }
    return true
}

private fun isPermutationPalindrome(str: String): Boolean {
    var rotationIndex = 0
    while (rotationIndex < str.length && !isPalindrome(
            str.substring(rotationIndex + 1 until str.length) + str.substring(
                0 until rotationIndex
            )
        )
    ) {
        rotationIndex++
    }
    if (rotationIndex == str.length)
        return false
    return true
}

private class Test {
    @Test
    fun `"gikig" is a palindrome`() {
        isPermutationPalindrome("gikig") shouldBeEqualTo true
    }

    @Test
    fun `"ookvk" is a palindrome`() {
        isPermutationPalindrome("ookvk") shouldBeEqualTo true
    }

    @Test
    fun `"sows" is a palindrome`() {
        isPermutationPalindrome("sows") shouldBeEqualTo false
    }

    @Test
    fun `"tami" is a palindrome`() {
        isPermutationPalindrome("tami") shouldBeEqualTo false
    }
}
