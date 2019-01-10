package com.igorwojda.codingpuzzle.anagram

/**
 * Notes: we could also use regex to remove unnecessary characters
 */

private object AnagramSolution {
    private fun anagrams(str1: String, str2: String): Boolean {
        val characterMap1 = getCharMap(str1)
        val characterMap2 = getCharMap(str2)

        return characterMap1 == characterMap2
    }

    private fun getCharMap(str: String): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()

        str.map { it.toLowerCase() }
            .filter { it.isLetterOrDigit() }
            .forEach {
                map[it] = map[it] ?: 0
            }

        return map
    }
}
