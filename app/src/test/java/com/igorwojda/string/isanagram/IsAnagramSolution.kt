package com.igorwojda.string.isanagram

private object Solution1 {
    private fun isAnagram(str1: String, str2: String): Boolean {
        val a1 = str1.toUpperCase().filter { it.isLetter() }.groupBy { it }
        val a2 = str2.toUpperCase().filter { it.isLetter() }.groupBy { it }
        return a1 == a2
    }
}

private object Solution2 {
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

private object KtLintWillNotComplain
