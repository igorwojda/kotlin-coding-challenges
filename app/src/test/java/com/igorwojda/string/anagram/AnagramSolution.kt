package com.igorwojda.string.anagram

private object AnagramSolution {
    private fun anagrams(str1: String, str2: String): Boolean {
        val charFrequency1 = getCharFrequency(str1)
        val charFrequency2 = getCharFrequency(str2)

        return charFrequency1 == charFrequency2
    }

    private fun getCharFrequency(str: String): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()

        str.map { it.toLowerCase() }
            .filter { it.isLetterOrDigit() }
            .forEach { map.merge(it, 1, Int::plus) }

        return map
    }
}
