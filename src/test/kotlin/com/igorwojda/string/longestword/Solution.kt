package com.igorwojda.string.longestword

// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    private fun longestWord(str: String): String = str
        .map { if (it.isLetter()) it else ' ' }
        .joinToString(separator = "")
        .split(" ")
        .filterNot { it.isBlank() }
        .maxBy { it.length }
}

private object KtLintWillNotComplain
