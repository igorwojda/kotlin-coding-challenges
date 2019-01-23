package com.igorwojda.string.isanagram

private object IsAnagramSolution {
    private fun isAnagram(str1: String, str2: String): Boolean {
        return getCharFrequency(str1) == getCharFrequency(str2)
    }

    private fun getCharFrequency(str: String): Map<Char, Int> {
        return str.toLowerCase()
            .filter { it.isLetterOrDigit() }
            .groupingBy { it }
            .eachCount()
    }
}
