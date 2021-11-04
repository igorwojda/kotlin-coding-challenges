package com.igorwojda.string.isanagram

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun isAnagram(str1: String, str2: String): Boolean {
    //                                  Can be replaced with .isLetter()
    val string1 = (str1.toLowerCase().filter { c: Char -> c in 'a'..'z' })
    val string2 = (str2.toLowerCase().filter { c: Char -> c in 'a'..'z' })
    if (string1.length != string2.length)
        return false
    // Next 6 lines can be replaced with .groupBy()
    val hash1 = hashMapOf<Char, Int>()
    val hash2 = hashMapOf<Char, Int>()
    for (i in string1.indices) {
        hash1[string1[i]] = hash1.getOrDefault(string1[i], 0) + 1
        hash2[string2[i]] = hash2.getOrDefault(string2[i], 0) + 1
    }
    // Can be replaced with hash1 == hash2
    for (i in hash1.keys) {
        if (!hash2.containsKey(i))
            return false
        if (hash2[i] != hash1[i])
            return false
    }
    return true
}

private class Test {
    @Test
    fun `"rail safety" is an anagram of "fairy tales"`() {
        isAnagram("rail safety", "fairy tales") shouldBeEqualTo true
    }

    @Test
    fun `"RAIL! SAFETY!" is an anagram of "fairy tales" - ignore letter casing`() {
        isAnagram("RAIL SAFETY", "fairy tales") shouldBeEqualTo true
    }

    @Test
    fun `"RAIL! SAFETY!" is an anagram of "fairy tales" - ignore special characters`() {
        isAnagram("rail safety!!", "fairy tales") shouldBeEqualTo true
    }

    @Test
    fun `"hi" is an anagram of "ihi"`() {
        isAnagram("hi", "ihi") shouldBeEqualTo false
    }

    @Test
    fun `"hello" is an anagram of "llohe"`() {
        isAnagram("hello", "llohe") shouldBeEqualTo true
    }

    @Test
    fun `"Whoa! Hi!" is an anagram of "Hi! Whoa!"`() {
        isAnagram("Whoa! Hi!", "Hi! Whoa!") shouldBeEqualTo true
    }

    @Test
    fun `"One One" is not an anagram of "Two two two"`() {
        isAnagram("One One", "Two two two") shouldBeEqualTo false
    }

    @Test
    fun `"One one" is not an anagram of "One one c"`() {
        isAnagram("One one", "One one c") shouldBeEqualTo false
    }

    @Test
    fun `"One one" is not an anagram of "One one  " - ignore spaces`() {
        isAnagram("One one", "One one  ") shouldBeEqualTo true
    }

    @Test
    fun `"A tree, a life, a bench" is not an anagram of "A tree, a fence, a yard"`() {
        isAnagram("A tree, a life, a bench", "A tree, a fence, a yard") shouldBeEqualTo false
    }
}
