package com.igorwojda.string.longestword

private object Solution1 {
    private fun longestWord(str: String): String {
        return str.map { if (it.isLetter()) it else ' ' }
            .joinToString(separator = "")
            .split(" ")
            .filterNot { it.isBlank() }
            .maxBy { it.length }
    }
}

private object KtLintWillNotComplain
