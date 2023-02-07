package com.igorwojda.string.isanagram

private object Solution1 {
    private fun isAnagram(str1: String, str2: String): Boolean {
        val a1 = str1.uppercase().filter { it.isLetter() }.groupBy { it }
        val a2 = str2.uppercase().filter { it.isLetter() }.groupBy { it }
        return a1 == a2
    }
}

private object Solution2 {
    private fun isAnagram(str1: String, str2: String): Boolean {
        return getCharFrequency(str1) == getCharFrequency(str2)
    }

    private fun getCharFrequency(str: String): Map<Char, List<Char>> {
        return str.lowercase()
            .filter { it.isLetterOrDigit() }
            .groupBy { it }
    }
}

private object Solution3 {
    private fun isAnagram(str1: String, str2: String): Boolean {
        return getCharFrequency(str1) == getCharFrequency(str2)
    }

    private fun getCharFrequency(str: String): Map<Char, Int> {
        return str.lowercase()
            .filter { it.isLetterOrDigit() }
            .groupingBy { it }
            .eachCount()
    }
}

private object KtLintWillNotComplain
