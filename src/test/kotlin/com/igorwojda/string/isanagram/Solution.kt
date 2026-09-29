package com.igorwojda.string.isanagram

// Time complexity: O(n + m) - n is str1 length, m is str2 length
// Space complexity: O(n + m)
private object Solution1 {
    private fun isAnagram(
        str1: String,
        str2: String,
    ): Boolean {
        val a1 = str1.uppercase().filter { it.isLetter() }.groupBy { it }
        val a2 = str2.uppercase().filter { it.isLetter() }.groupBy { it }
        return a1 == a2
    }
}

// Time complexity: O(n + m) - n is str1 length, m is str2 length
// Space complexity: O(n + m)
private object Solution2 {
    private fun isAnagram(
        str1: String,
        str2: String,
    ): Boolean = getCharFrequency(str1) == getCharFrequency(str2)

    private fun getCharFrequency(str: String): Map<Char, List<Char>> = str
        .lowercase()
        .filter { it.isLetterOrDigit() }
        .groupBy { it }
}

// Time complexity: O(n + m) - n is str1 length, m is str2 length
// Space complexity: O(n + m)
private object Solution3 {
    private fun isAnagram(
        str1: String,
        str2: String,
    ): Boolean = getCharFrequency(str1) == getCharFrequency(str2)

    private fun getCharFrequency(str: String): Map<Char, Int> = str
        .lowercase()
        .filter { it.isLetterOrDigit() }
        .groupingBy { it }
        .eachCount()
}

private object KtLintWillNotComplain
